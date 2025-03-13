package daily

import Exercise
import java.util.SortedMap
import kotlin.math.max
import kotlin.math.pow

/**
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
class Daily20240212 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, intArrayOf(3,2,3), 3)
        val test2 = runTest(2, intArrayOf(2,2,1,1,1,2,2), 2)
        return test1 && test2
    }

    fun runTest(n: Int, testInput: IntArray, test1Sol: Int): Boolean {
        val testRes = majorityElement(testInput)
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

    fun majorityElement(nums: IntArray): Int {
        var temp = 0
        for (i in nums.indices) {
            for (j in 0 until nums.size -1 - i) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j]
                    nums[j] = nums[j + 1]
                    nums[j + 1] = temp
                }
            }
        }
        return nums[nums.size / 2]
    }
}

