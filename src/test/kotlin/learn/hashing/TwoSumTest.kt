package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TwoSumTest {

    @Test
    fun twoSum() {
        val solution = TwoSum()
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(2,7,11,15), 9))
        assertArrayEquals(intArrayOf(1,2), solution.twoSum(intArrayOf(3,2,4), 6))
        assertArrayEquals(intArrayOf(0,1), solution.twoSum(intArrayOf(3,3), 6))
    }
}