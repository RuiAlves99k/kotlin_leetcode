package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SlidingWindowHashTest {

    @Test
    fun countElements() {
        val solution = SlidingWindowHash()
        assertEquals(3, solution.countElements("eceba", 2))
    }
}