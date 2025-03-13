package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class NumberWaysSplitArrayTest {

    @Test
    fun waysToSplitArray() {
        val solution = NumberWaysSplitArray()
        assertEquals(2, solution.waysToSplitArray(intArrayOf(10,4,-8,7)))
    }
}