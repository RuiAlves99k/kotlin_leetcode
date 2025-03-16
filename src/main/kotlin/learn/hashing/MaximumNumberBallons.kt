package learn.hashing

/**
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 *
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: text = "nlaebolko"
 * Output: 1
 * Example 2:
 *
 *
 *
 * Input: text = "loonbalxballpoon"
 * Output: 2
 * Example 3:
 *
 * Input: text = "leetcode"
 * Output: 0
 */
class MaximumNumberBallons {
    fun maxNumberOfBalloons(text: String): Int {
        val occurrenceEachLetter = hashMapOf<Char, Int>()
        for (letter in text) {
            occurrenceEachLetter[letter] = occurrenceEachLetter.getOrDefault(letter, 0) + 1
        }
        val word = "balloon"
        var expectedOccurrence = hashMapOf<Char, Int>()
        for (letter in word) {
            expectedOccurrence[letter] = expectedOccurrence.getOrDefault(letter, 0) + 1
        }
        var maxOccurrence =
            occurrenceEachLetter.getOrDefault(word[0], 0).floorDiv(expectedOccurrence.getOrDefault(word[0], 1))
        for (letter in word) {
            maxOccurrence = Math.min(
                maxOccurrence,
                occurrenceEachLetter.getOrDefault(letter, 0).floorDiv(expectedOccurrence.getOrDefault(letter, 1))
            )
        }
        return maxOccurrence
    }
}