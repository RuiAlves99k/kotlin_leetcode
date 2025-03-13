package daily

import Exercise
import java.util.SortedMap
import kotlin.math.max
import kotlin.math.pow

/**
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.



Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 */
class Daily20240210 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, "abc", 3)
        val test2 = runTest(2, "aaa", 6)
        val test3 = runTest(3, "fdsklf", 6)
        return test1 && test2 && test3
    }

    fun runTest(n: Int, testInput: String, test1Sol: Int): Boolean {
        val testRes = countSubstrings(testInput)
        val test = testRes == test1Sol
        println("Test $n: $test Res: ${testRes}, Sol: $test1Sol")
        return test
    }

    fun <T> getString(list: List<T>): String {
        return "[${list.joinToString()}]"
    }

    fun <T> getString2(list: List<List<T>>): String {
        return "[${list.joinToString { it.joinToString() }}]"
    }

    fun countSubstrings(s: String): Int {
        var count = 0
        var temp = ""
//        for (i in s.indices){
//            dp.add(s[i].toString())
//            for (j in i+1 until s.length){
//                temp = "${dp.last()}${s[j]}"
//                if (temp == temp.reversed()){
//                    dp.add(temp)
//                }
//            }
//        }
        var left = 0
        var right = 1
        while (left < s.length){
            count++
            right = left + 1
            while (right < s.length){
                if (s.substring(left..right).let { it == it.reversed() })
                    count++
                right++
            }
            left++
        }
        return count
    }
}

