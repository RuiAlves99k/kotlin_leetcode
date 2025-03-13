package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MaximumAverageSubarrayITest {

    @Test
    fun findMaxAverage() {
        val solution = MaximumAverageSubarrayI()
        assertEquals(2.0, solution.findMaxAverage(intArrayOf(0,1,1,3,3), 4))
        assertEquals(12.75000, solution.findMaxAverage(intArrayOf(1,12,-5,-6,50,3), 4))
    }
}