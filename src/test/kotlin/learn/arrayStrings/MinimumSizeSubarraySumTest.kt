package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MinimumSizeSubarraySumTest {

    @Test
    fun minSubArrayLen() {
        val solution = MinimumSizeSubarraySum()
        assertEquals(2, solution.minSubArrayLen(7, intArrayOf(2,3,1,2,4,3)))
        assertEquals(1, solution.minSubArrayLen(4, intArrayOf(1,4,4)))
        assertEquals(0, solution.minSubArrayLen(11, intArrayOf(1,1,1,1,1,1,1,1)))
    }
}