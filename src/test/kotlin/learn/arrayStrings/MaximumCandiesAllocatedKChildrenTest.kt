package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MaximumCandiesAllocatedKChildrenTest {

    @Test
    fun maximumCandies() {
        val solution = MaximumCandiesAllocatedKChildren()
        assertEquals(5, solution.maximumCandies(intArrayOf(5,8,6), 3))
        assertEquals(0, solution.maximumCandies(intArrayOf(2,5), 11))
    }
}