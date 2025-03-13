package daily

import Exercise


/**
Given an integer array arr, partition the array into (contiguous) subarrays of length at most k.
After partitioning, each subarray has their values changed to become the maximum value of that subarray.

Return the largest sum of the given array after partitioning. Test cases are generated so that the answer fits in a 32-bit integer.

Example 1:

Input: arr = [1,15,7,9,2,5,10], k = 3
Output: 84
Explanation: arr becomes [15,15,15,9,10,10,10]
Example 2:

Input: arr = [1,4,1,5,7,3,6,1,9,9,3], k = 4
Output: 83
Example 3:

Input: arr = [1], k = 1
Output: 1

 */
class Daily20240203 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, intArrayOf(1, 15, 7, 9, 2, 5, 10), 3, 84)
        val test2 = runTest(2, intArrayOf(1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3), 4, 83)
        return test1 && test2
    }

    fun runTest(n: Int, testInput: IntArray, testInput2: Int, test1Sol: Int): Boolean {
        val testRes = maxSumAfterPartitioning(testInput, testInput2)
        val test = testRes == test1Sol
        println("Test $n: $test Res: ${testRes}, Sol: $test1Sol")
        return test
    }

    fun getString(list: List<Int>): String {
        return "[${list.joinToString()}]"
    }

    fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
        val tempArray = IntArray(arr.size) { 0 }
        for (i in arr.indices) {
            var maxValue = 0
            for (j in 1..k) {
                if (i - j + 1 >= 0) {
                    maxValue = maxOf(maxValue, arr[i - j + 1])
                    val sum = if (i - j >= 0) maxValue * j + tempArray[i - j] else maxValue * j
                    tempArray[i] = maxOf(tempArray[i], sum)
                }
            }
        }
        return tempArray.last()
    }
}