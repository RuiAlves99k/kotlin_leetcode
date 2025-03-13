package learn.arrayStrings

/**
 * 3356. Zero Array Transformation II
 * Medium
 * You are given an integer array nums of length n and a 2D array queries where queries[i] = [li, ri, vali].
 *
 * Each queries[i] represents the following action on nums:
 *
 * Decrement the value at each index in the range [li, ri] in nums by at most vali.
 * The amount by which each value is decremented can be chosen independently for each index.
 * A Zero Array is an array with all its elements equal to 0.
 *
 * Return the minimum possible non-negative value of k, such that after processing the first k queries in sequence, nums becomes a Zero Array. If no such k exists, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,0,2], queries = [[0,2,1],[0,2,1],[1,1,3]]
 *
 * Output: 2
 *
 * Explanation:
 *
 * For i = 0 (l = 0, r = 2, val = 1):
 * Decrement values at indices [0, 1, 2] by [1, 0, 1] respectively.
 * The array will become [1, 0, 1].
 * For i = 1 (l = 0, r = 2, val = 1):
 * Decrement values at indices [0, 1, 2] by [1, 0, 1] respectively.
 * The array will become [0, 0, 0], which is a Zero Array. Therefore, the minimum value of k is 2.
 * Example 2:
 *
 * Input: nums = [4,3,2,1], queries = [[1,3,2],[0,2,1]]
 *
 * Output: -1
 *
 * Explanation:
 *
 * For i = 0 (l = 1, r = 3, val = 2):
 * Decrement values at indices [1, 2, 3] by [2, 2, 1] respectively.
 * The array will become [4, 1, 0, 0].
 * For i = 1 (l = 0, r = 2, val = 1):
 * Decrement values at indices [0, 1, 2] by [1, 1, 0] respectively.
 * The array will become [3, 0, 0, 0], which is not a Zero Array.
 */
class ZeroArrayTransformationII {
    fun minZeroArray(nums: IntArray, queries: Array<IntArray>): Int {
//        return bruteForce(nums, queries)
        return optimized(nums, queries)
    }

    private fun bruteForce(nums: IntArray, queries: Array<IntArray>): Int {
        var k = 0
        val total = IntArray(nums.size) { 0 }
        for (i in 0 until nums.size) {
            while (k < queries.size && nums[i] - total[i] > 0) {
                for (j in queries[k][0]..queries[k][1]) {
                    total[j] += queries[k][2]
                }
                k++
            }
            if (nums[i] - total[i] > 0) {
                return -1
            }
        }
        return k
    }

    private fun optimized(nums: IntArray, queries: Array<IntArray>): Int {
        var l = 0
        var r = queries.size
        var ans = -1
        while (l <= r) {
            val m = (l + r) / 2
            if (checkIfPossible(m, nums, queries)) {
                ans = m
                r = m - 1
            } else {
                l = m + 1
            }
        }
        return ans
    }

    private fun checkIfPossible(k: Int, nums: IntArray, queries: Array<IntArray>): Boolean {
        val n = nums.size
        val q = IntArray(n) { 0 }
        for (i in 0..k - 1) {
            val start = queries[i][0]
            val end = queries[i][1]
            val value = queries[i][2]
            q[start] += value
            if (end + 1 < n) {
                q[end + 1] += (-value)
            }
        }
        for (i in 1..n - 1) {
            q[i] = q[i - 1] + q[i]
        }
        for (i in 0..n - 1) {
            if (nums[i] - q[i] > 0) {
                return false
            }
        }
        return true
    }
}