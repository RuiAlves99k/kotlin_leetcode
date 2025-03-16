package learn.hashing

/**
 * Given a string s, return true if s is a good string, or false otherwise.
 *
 * A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abacbc"
 * Output: true
 * Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
 * Example 2:
 *
 * Input: s = "aaabb"
 * Output: false
 * Explanation: The characters that appear in s are 'a' and 'b'.
 * 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 *
 */
class CheckAllCharactersHaveEqualNumberOccurrence {
    fun areOccurrencesEqual(s: String): Boolean {
        val hash = hashMapOf<Char, Int>()
        for (c in s){
            hash[c] = hash.getOrDefault(c, 0) + 1
        }
        val occurrence = hash[s[0]]
        for (key in hash.keys){
            if (hash[key] != occurrence){
                return false
            }
        }
        return true
    }
}