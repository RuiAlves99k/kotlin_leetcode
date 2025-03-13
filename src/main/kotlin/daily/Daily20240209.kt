package daily

import Exercise
import java.util.SortedMap
import kotlin.math.max
import kotlin.math.pow


/**
Given a set of distinct positive integers nums, return the largest subset
answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:

answer[i] % answer[j] == 0, or
answer[j] % answer[i] == 0
If there are multiple solutions, return any of them.



Example 1:

Input: nums = [1,2,3]
Output: [1,2]
Explanation: [1,3] is also accepted.
Example 2:

Input: nums = [1,2,4,8]
Output: [1,2,4,8]
 */
class Daily20240209 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, intArrayOf(1, 2, 3), listOf(1, 2))
        val test2 = runTest(2, intArrayOf(1, 2, 4, 8), listOf(1, 2, 4, 8))
        val test3 = runTest(3, intArrayOf(3,4,16,8), listOf(4,8,16))
        val test4 = runTest(4, intArrayOf(3,17), listOf(3))
        val test5 = runTest(4, intArrayOf(5,9,18,54,108,540,90,180,360,720), listOf(9,18,90,180,360,720))
        return test1 && test2 && test3 && test4 && test5
    }

    fun runTest(n: Int, testInput: IntArray, test1Sol: List<Int>): Boolean {
        val testRes = largestDivisibleSubset(testInput)
        val test = getString(testRes) == getString(test1Sol)
        println("Test $n: $test Res: ${testRes}, Sol: $test1Sol")
        return test
    }

    fun <T> getString(list: List<T>): String {
        return "[${list.joinToString()}]"
    }

    fun <T> getString2(list: List<List<T>>): String {
        return "[${list.joinToString { it.joinToString() }}]"
    }

    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        var tempArray = mutableListOf<Int>()
        var finalArray : List<Int> = listOf()
        var add = true
        for (i in nums.indices){
            tempArray.clear()
            tempArray.add(nums[i])
            for (j in nums.indices) {
                if (j == i)
                    continue
                add = true
                for (k in tempArray.indices){
                    if (!add)
                        break
                    add = nums[j] % tempArray[k] == 0 ||  tempArray[k] % nums[j] == 0
                }
                if (add)
                    tempArray.add(nums[j])
            }
            if (tempArray.size > finalArray.size)
                finalArray = tempArray.toList()
        }
        return finalArray
    }

}