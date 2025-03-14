package learn.arrayStrings

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "Mr Ding"
 * Output: "rM gniD"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * s contains printable ASCII characters.
 * s does not contain any leading or trailing spaces.
 * There is at least one word in s.
 * All the words in s are separated by a single space.
 */
class ReverseWordsStringIII {
    fun reverseWords(s: String): String {
        val string = StringBuilder()
        var l = 0
        for(r in 0 until s.length){
            if (s[r] == ' '){
                for (j in r-1 downTo l){
                    string.append(s[j])
                }
                string.append(" ")
                l = r + 1
            }
        }
        for(r in s.length - 1 downTo l){
            string.append(s[r])
        }
        return string.toString()
    }
}