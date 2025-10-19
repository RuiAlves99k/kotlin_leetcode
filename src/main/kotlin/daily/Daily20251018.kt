package daily

/**
 * 3397. Maximum Number of Distinct Elements After Operations
 * Medium
 * Topics
 * premium lock icon
 * Companies
 * Hint
 * You are given an integer array nums and an integer k.
 *
 * You are allowed to perform the following operation on each element of the array at most once:
 *
 * Add an integer in the range [-k, k] to the element.
 * Return the maximum possible number of distinct elements in nums after performing the operations.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3,3,4], k = 2
 *
 * Output: 6
 *
 * Explanation:
 *
 * nums changes to [-1, 0, 1, 2, 3, 4] after performing operations on the first four elements.
 *
 * Example 2:
 *
 * Input: nums = [4,4,4,4], k = 1
 *
 * Output: 3
 *
 * Explanation:
 *
 * By adding -1 to nums[0] and 1 to nums[1], nums changes to [3, 5, 4, 4].
 s
 r-ms/)q
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 109
 * 0 <= k <= 109
 */
class Daily20251018 {
    fun maxDistinctElements(nums: IntArray, k: Int): Int {
        // 1,2,2,3,4
        // 2
        // 1 -> [2,3] = 3,4
        val sortedList = nums.sorted()
        val possibilities = mutableSetOf<Int>()
        for(i in 0 until sortedList.size){
            for (j in -k..k){
                val value = sortedList[i] + j
                if (possibilities.isEmpty() || possibilities.last() < value){
                    possibilities.add(value)
                    break
                }
            }
        }
        print(possibilities)
        return possibilities.size
    }
}