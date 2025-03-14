package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class IntersectionMultipleArraysTest {

    @Test
    fun intersection() {
        val solution = IntersectionMultipleArrays()
        assertArrayEquals(intArrayOf(3,4), solution.intersection(arrayOf(intArrayOf(3,1,2,4,5), intArrayOf(1,2,3,4), intArrayOf(3,4,5,6))).toIntArray())
        assertArrayEquals(intArrayOf(), solution.intersection(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6))).toIntArray())
    }
}