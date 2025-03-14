package learn.hashing

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 * Example 2:
 *
 * Input: sentence = "leetcode"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= sentence.length <= 1000
 * sentence consists of lowercase English letters.
 */
class CheckIfSentenceIsPangram {
    fun checkIfPangram(sentence: String): Boolean {
        // 97 is a in ASCII
        // 122 is z in ASCII
        val seen = hashSetOf<Char>()
        for (c in sentence){
            seen.add(c)
        }
        return seen.size == 26
    }
}