package daily

import Exercise
import java.util.ArrayDeque
import java.util.Stack

/**
 * ou are given an integer array nums of size n and a positive integer k.
 *
 * Divide the array into one or more arrays of size 3 satisfying the following conditions:
 *
 * Each element of nums should be in exactly one array.
 * The difference between any two elements in one array is less than or equal to k.
 * Return a 2D array containing all the arrays. If it is impossible to satisfy the conditions, return an empty array.
 * And if there are multiple answers, return any of them.
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
 * Output: [[1,1,3],[3,4,5],[7,8,9]]
 * Explanation: We can divide the array into the following arrays: [1,1,3], [3,4,5] and [7,8,9].
 * The difference between any two elements in each array is less than or equal to 2.
 * Note that the order of elements is not important.
 *
 *
 * Example 2:
 *
 * Input: nums = [1,3,3,2,7,3], k = 3
 * Output: []
 * Explanation: It is not possible to divide the array satisfying all the conditions.
 */
class Daily20240201 : Exercise {
    override fun start(): Boolean {
        val test1Input = intArrayOf(1, 3, 4, 8, 7, 9, 3, 5, 1)
        val test1Input2 = 2
        val test1Res = divideArray(test1Input, test1Input2)
        val test1Sol = arrayOf(intArrayOf(1, 1, 3), intArrayOf(3, 4, 5), intArrayOf(7, 8, 9))
        val test1 = getString(test1Res) == getString(test1Sol)
        println("Test 1: $test1 Res: ${test1Res.map { "[${it.joinToString()}]" }}, Sol: ${test1Sol.map { "[${it.joinToString()}]" }}")
        val test2Input = intArrayOf(1,3,3,2,7,3)
        val test2Input2 = 3
        val test2Res = divideArray(test2Input, test2Input2)
        val test2Sol = arrayOf<IntArray>()
        val test2 = getString(test2Res) == getString(test2Sol)
        println("Test2 $test2 Res: ${test2Res.map { "[${it.joinToString()}]" }}, Sol: ${test2Sol.map { "[${it.joinToString()}]" }}")
        return test1 && test2
    }

    fun getString(list: Array<IntArray>): String {
        return list.map { "[${it.joinToString()}]" }.toString()
    }

    fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
        val sorted = nums.sortedArray()
        val finalArray = mutableListOf<IntArray>()
        val tempArray = mutableListOf<Int>()
        for (i in sorted.indices step 3) {
            if (
                sorted[i] - sorted[i + 1] > k ||
                sorted[i] - sorted[i + 2] > k ||
                sorted[i + 1] - sorted[i] > k ||
                sorted[i + 1] - sorted[i + 2] > k ||
                sorted[i + 2] - sorted[i] > k ||
                sorted[i + 2] - sorted[i + 1] > k
            ) {
                return arrayOf()
            }
            tempArray.add(sorted[i])
            tempArray.add(sorted[i + 1])
            tempArray.add(sorted[i + 2])
            finalArray.add(tempArray.toIntArray())
            tempArray.clear()
        }
        return finalArray.toTypedArray()
    }
}