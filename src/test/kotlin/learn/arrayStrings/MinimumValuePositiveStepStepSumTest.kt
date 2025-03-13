package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MinimumValuePositiveStepStepSumTest {

    @Test
    fun minStartValue() {
        val solution = MinimumValuePositiveStepStepSum()
        assertEquals(5, solution.minStartValue(intArrayOf(-3,2,-3,4,2)))
    }
}