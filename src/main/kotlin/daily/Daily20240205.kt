package daily

import Exercise


/**
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 */
class Daily20240205 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, "leetcode", 0)
        val test2 = runTest(2, "loveleetcode", 2)
        val test3 = runTest(3, "aabb", -1)
        return test1 && test2 && test3
    }

    fun runTest(n: Int, testInput: String, test1Sol: Int): Boolean {
        val testRes = firstUniqChar(testInput)
        val test = testRes == test1Sol
        println("Test $n: $test Res: ${testRes}, Sol: $test1Sol")
        return test
    }

    fun getString(list: List<Int>): String {
        return "[${list.joinToString()}]"
    }

    fun firstUniqChar(s: String): Int {
        val duplicatedLetters = mutableListOf<Char>()
        var found = false
        for (i in s.indices){
            if (duplicatedLetters.contains(s[i]))
                continue
            found = false
            for (j in i+1 until s.length){
                if (s[i] == s[j]){
                    found = true
                    break
                }
            }
            if (!found)
                return i
            else
                duplicatedLetters.add(s[i])
        }
        return -1
    }
}