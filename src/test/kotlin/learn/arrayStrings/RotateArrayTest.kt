package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RotateArrayTest {

    @Test
    fun rotate() {
        val solution = RotateArray()
        assertArrayEquals(arrayOf(5,6,7,1,2,3,4), solution.rotate(intArrayOf(1,2,3,4,5,6,7), 3).toTypedArray())
        assertArrayEquals(arrayOf(3,99, -1, -100), solution.rotate(intArrayOf(-1,-100,3,99), 2).toTypedArray())
    }
}