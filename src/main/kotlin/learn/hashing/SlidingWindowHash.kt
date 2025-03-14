package learn.hashing

/**
 * You are given a string s and an integer k. Find the length of the longest substring that contains at most k distinct characters.
 *
 * For example, given s = "eceba" and k = 2, return 3. The longest substring with at most 2 distinct characters is "ece"
 */
class SlidingWindowHash {
    fun countElements(s: String, k: Int): Int{
        val counts = hashMapOf<Char, Int>()
        var left = 0
        var ans = 0
        for (right in 0 until s.length){
            val c : Char = s[right]
            counts[c] = counts.getOrDefault(c, 0) + 1
            while (counts.size > k){
                val remove = s[left]
                counts[remove] = counts.getOrDefault(remove, 0) - 1
                if (counts.get(remove) == 0){
                    counts.remove(remove)
                }
                left++
            }
            ans = Math.max(ans, right - left + 1)
        }
        return ans
    }
}