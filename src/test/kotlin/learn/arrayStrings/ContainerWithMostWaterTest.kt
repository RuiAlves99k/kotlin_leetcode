package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ContainerWithMostWaterTest {

    @Test
    fun maxArea() {
        val solution = ContainerWithMostWater()
        assertEquals(49, solution.maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
        assertEquals(1, solution.maxArea(intArrayOf(1,1)))
    }
}