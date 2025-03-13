package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ZeroArrayTransformationIITest {

    @Test
    fun minZeroArray() {
        val solution = ZeroArrayTransformationII()
        assertEquals(2, solution.minZeroArray(intArrayOf(2,0,2), arrayOf(intArrayOf(0,2,1), intArrayOf(0,2,1), intArrayOf(1,1,3))))
        assertEquals(-1, solution.minZeroArray(intArrayOf(4,3,2,1), arrayOf(intArrayOf(1,3,2), intArrayOf(0,2,1))))
        assertEquals(5, solution.minZeroArray(intArrayOf(8,4), arrayOf(intArrayOf(0,1,5), intArrayOf(1,1,5), intArrayOf(1,1,3), intArrayOf(1,1,4), intArrayOf(0,0,3), intArrayOf(1,1,4), intArrayOf(0,1,2), intArrayOf(1,1,3), intArrayOf(1,1,1))))
        assertEquals(0, solution.minZeroArray(intArrayOf(0), arrayOf(intArrayOf(0,0,5), intArrayOf(0,0,1), intArrayOf(0,0,3))))
        assertEquals(1, solution.minZeroArray(intArrayOf(5), arrayOf(intArrayOf(0,0,5), intArrayOf(0,0,1), intArrayOf(0,0,3), intArrayOf(0,0,2))))
    }
}