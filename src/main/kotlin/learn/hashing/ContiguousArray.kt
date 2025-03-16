package learn.hashing

import kotlin.math.max

/**
 * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
 * Example 2:
 *
 * Input: nums = [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * Example 3:
 *
 * Input: nums = [0,1,1,1,1,1,0,0,0]
 * Output: 6
 * Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.
 */
class ContiguousArray {
    fun findMaxLength(nums: IntArray): Int {
        var maxLen = -1
        var count = 0
        val map = hashMapOf<Int, Int>()
        for (i in 0 until nums.size){
            count += if (nums[i] == 1) 1 else -1
            if (map.contains(count)){
                maxLen = Math.max(maxLen, i - map[count]!!)
            } else {
                map[count] = i
            }
        }
        return maxLen
    }
}