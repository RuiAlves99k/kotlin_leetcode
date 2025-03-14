package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CountingElementsTest {

    @Test
    fun countElements() {
        val solution = CountingElements()
        assertEquals(2, solution.countElements(intArrayOf(1, 2, 3)))
        assertEquals(0, solution.countElements(intArrayOf(1, 1, 3, 3, 5, 5, 7, 7)))
        assertEquals(3, solution.countElements(intArrayOf(1, 3, 2, 3, 5, 0)))
    }
}