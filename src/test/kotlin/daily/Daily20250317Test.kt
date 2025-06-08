package daily

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Daily20250317Test {

    @Test
    fun divideArray() {
        val solution = Daily20250317()
        assertEquals(true, solution.divideArray(intArrayOf(3,2,3,2,2,2)))
        assertEquals(false, solution.divideArray(intArrayOf(1,2,3,4)))
    }
}