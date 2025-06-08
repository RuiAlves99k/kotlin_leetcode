package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ThreeSumTest {

    @Test
    fun threeSum() {
        val solution = ThreeSum()
        assertArrayEquals(
            listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)).toTypedArray(),
            solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)).toTypedArray()
        )
        assertArrayEquals(listOf<List<Int>>().toTypedArray(), solution.threeSum(intArrayOf(0, 1, 1)).toTypedArray())
        assertArrayEquals(listOf(listOf(0, 0, 0)).toTypedArray(), solution.threeSum(intArrayOf(0, 0, 0)).toTypedArray())
    }
}