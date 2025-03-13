package daily

import Exercise


/**
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.



Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.

 */
class Daily20240204 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, "ADOBECODEBANC", "ABC", "BANC")
        val test2 = runTest(2, "a", "a", "a")
        val test3 = runTest(3, "a", "aa", "")
        val test4 = runTest(4, "ab", "a", "a")
        val test5 = runTest(5, "abc", "ab", "ab")
        val test6 = runTest(6, "abcdab", "abd", "dab")
        val test7 = runTest(7, "ba", "a", "a")
        return test1 && test2 && test3 && test4 && test5 && test6 && test7
    }

    fun runTest(n: Int, testInput: String, testInput2: String, test1Sol: String): Boolean {
        val testRes = minWindow(testInput, testInput2)
        val test = testRes == test1Sol
        println("Test $n: $test Res: ${testRes}, Sol: $test1Sol")
        return test
    }

    fun getString(list: List<Int>): String {
        return "[${list.joinToString()}]"
    }

    fun minWindow(s: String, t: String): String {
        if (s.length < t.length) return ""

        val tCounts = t.groupingBy { it }.eachCount().toMutableMap()
        val windowsCounts = mutableMapOf<Char, Int>()
        var have = 0
        var need = tCounts.size

        var result = ""
        var resultLength = Int.MAX_VALUE
        var left = 0

        for (right in s.indices) {
            val char = s[right]
            windowsCounts[char] = windowsCounts.getOrDefault(char, 0) + 1
            if (tCounts.containsKey(char) && windowsCounts[char] == tCounts[char]) {
                have++
            }

            while (have == need) {
                if (right - left + 1 < resultLength) {
                    result = s.substring(left, right + 1)
                    resultLength = right - left +1
                }

                windowsCounts[s[left]] = windowsCounts[s[left]]!! -1
                if (tCounts.containsKey(s[left]) && windowsCounts[s[left]]!! < tCounts[s[left]]!!){
                    have--
                }
                left++
            }
        }
        return result
    }
}