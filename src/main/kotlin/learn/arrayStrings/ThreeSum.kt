package learn.arrayStrings

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 */
class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        //brute force
//        val usedCombination = hashMapOf<String, List<Int>>()
//        for (i in 0 until nums.size){
//            for (j in i + 1 until nums.size){
//                for (k in j + 1 until nums.size){
//                    val list = listOf(nums[i], nums[j], nums[k])
//                    val key = list.sorted().toString()
//                    if (nums[i] + nums[j] + nums[k] == 0){
//                        usedCombination[key] = list
//                    }
//                }
//            }
//        }
//        return usedCombination.values.toList()
        val usedCombination = hashMapOf<String, List<Int>>()
        var left = 0
        var right = 0
        var sum = 0
        val currentArray = mutableListOf<Int>()
        for (i in 0 until right){
            sum += nums[right]
            currentArray.add(nums[right])
            while (left - right == 3){
                if (sum == 0){
                    val key = currentArray.sorted().toString()
                    if (!usedCombination.contains(key)){
                        usedCombination[key] = currentArray
                    }
                }
                currentArray.removeAt(0)
                sum -= nums[left++]
            }
            right++
        }
        return usedCombination.values.toList()
    }
}