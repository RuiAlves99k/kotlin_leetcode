package daily

import Exercise

class Daily20240122 : Exercise {
    override fun start(): Boolean {
        val result = findErrorNums(intArrayOf(3, 2, 2))
//        val result = findErrorNums(intArrayOf(1,1))
        println("Result: [${result.forEach { print("$it, ") }}]")
        return result.contentEquals(intArrayOf(2, 1))
//        return result.contentEquals(intArrayOf(1, 2))
    }

    fun findErrorNums(nums: IntArray): IntArray {
        var duplicated: Int = -1
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
            if (duplicated != -1 && nums.count { it == nums[i] } > 1)
                duplicated = nums[i]
        }
        sum -= duplicated
        return intArrayOf(duplicated, (nums.size * (nums.size + 1) / 2) - sum)
    }

}