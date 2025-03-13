package daily

import Exercise
import java.util.SortedMap
import kotlin.math.max
import kotlin.math.pow


/**
Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words,
it is the product of some integer with itself. For example, 1, 4, 9, and 16
are perfect squares while 3 and 11 are not.



Example 1:

Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
 */
class Daily20240208 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, 12, 3)
        val test2 = runTest(2, 13, 2)
        return test1 && test2
    }

    fun runTest(n: Int, testInput: Int, test1Sol: Int): Boolean {
        val testRes = numSquares(testInput)
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

    fun numSquares(n: Int): Int {
        val dp = IntArray(n + 1) { Int.MAX_VALUE }
        dp[0] = 0

        for (i in 1..n) {
            var j = 1
            while (j * j <= i) {
                dp[i] = minOf(dp[i], dp[i - j * j] + 1)
                j++
            }
        }
        return dp[n]
    }

}