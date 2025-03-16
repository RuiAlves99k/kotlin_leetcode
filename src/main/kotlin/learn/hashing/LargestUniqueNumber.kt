package learn.hashing

/**
 * Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,3,9,4,9,8,3,1]
 * Output: 8
 * Explanation: The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it is the answer.
 * Example 2:
 *
 * Input: nums = [9,9,8,8]
 * Output: -1
 * Explanation: There is no number that occurs only once.
 */
class LargestUniqueNumber {
    fun largestUniqueNumber(nums: IntArray): Int {
        val occurrence = hashMapOf<Int, Int>()
        for (num in nums){
            occurrence[num] = occurrence.getOrDefault(num, 0) + 1
        }
        var biggestNumber = -1
        for (num in occurrence.keys){
            if (occurrence[num] == 1 && num > biggestNumber){
                biggestNumber = num
            }
        }
        return biggestNumber
    }
}