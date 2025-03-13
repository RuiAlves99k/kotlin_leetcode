package learn.arrayStrings

import kotlin.math.absoluteValue

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 *
 */
class SquareSortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        var l = 0
        var r = nums.size - 1
        val res = mutableListOf<Int>()
        while (l < r){
            if (nums[l].absoluteValue > nums[r].absoluteValue){
                res.add(0, nums[l] * nums[l])
                l++
            } else {
                res.add(0, nums[r] * nums[r])
                r--
            }
        }
        return res.toIntArray()
    }
}