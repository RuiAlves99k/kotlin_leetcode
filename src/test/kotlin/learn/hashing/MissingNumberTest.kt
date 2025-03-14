package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MissingNumberTest {

    @Test
    fun missingNumber() {
        val solution = MissingNumber()
        assertEquals(2, solution.missingNumber(intArrayOf(3,0,1)))
        assertEquals(2, solution.missingNumber(intArrayOf(0,1)))
        assertEquals(8, solution.missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
    }
}