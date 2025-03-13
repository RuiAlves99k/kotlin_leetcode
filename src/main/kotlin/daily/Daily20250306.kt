package daily

import Exercise
import java.lang.Integer.max
import kotlin.math.min

/**
 * Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences. If there are multiple valid strings, return any of them.
 *
 * A string s is a subsequence of string t if deleting some number of characters from t (possibly 0) results in the string s.
 *
 *
 *
 * Example 1:
 *
 * Input: str1 = "abac", str2 = "cab"
 * Output: "cabac"
 * Explanation:
 * str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
 * str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
 * The answer provided is the shortest such string that satisfies these properties.
 * Example 2:
 *
 * Input: str1 = "aaaaaaaa", str2 = "aaaaaaaa"
 * Output: "aaaaaaaa"
 *
 *
 * Constraints:
 *
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of lowercase English letters.
 */
class Daily20250306 : Exercise {
    class Solution {

        fun shortestCommonSupersequence(str1: String, str2: String): String {
            var minStr: String? = null
            var tempStr = ""
            str1.forEachIndexed { index, c ->
                str2.forEachIndexed { index2, c2 ->
                    if (c2 == c) {
                        tempStr += c2
                    }
                }
                tempStr = ""
            }
            return minStr ?: ""
        }
    }

    override fun start(): Boolean {
        val solution = Solution()
        val inputs = listOf(Pair("aaaaaaaa", "aaaaaaaa"))
        val results = listOf("aaaaaaaa")
        var passed = true
        results.forEachIndexed { index, s ->
            val result = solution.shortestCommonSupersequence(inputs[index].first, inputs[index].second) == s
            passed = passed && result
        }
        return passed
    }
}

