package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CountNumberNiceSubarraysTest {

    @Test
    fun numberOfSubarrays() {
        val solution = CountNumberNiceSubarrays()
        assertEquals(2, solution.numberOfSubarrays(intArrayOf(1, 1, 2, 1, 1), 3))
        assertEquals(0, solution.numberOfSubarrays(intArrayOf(2, 4, 6), 1))
        assertEquals(16, solution.numberOfSubarrays(intArrayOf(2, 2, 2, 1, 2, 2, 1, 2, 2, 2), 2))
    }
}