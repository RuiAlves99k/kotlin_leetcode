package learn.hashing

/**
 * Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
 *
 * Return the number of nice sub-arrays.
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,1,1], k = 3
 * Output: 2
 * Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
 * Example 2:
 *
 * Input: nums = [2,4,6], k = 1
 * Output: 0
 * Explanation: There are no odd numbers in the array.
 * Example 3:
 *
 * Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
 * Output: 16
 */
class CountNumberNiceSubarrays {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        val hash = mutableMapOf<Int, Int>()
        hash[0] = 1
        var curr = 0
        var ans = 0
        for (right in 0 until nums.size) {
            curr += if (nums[right] % 2 == 0) 0 else 1
            ans += hash.getOrDefault(curr -k, 0)
            hash[curr] = hash.getOrDefault(curr, 0) + 1
        }
        return ans
    }
}