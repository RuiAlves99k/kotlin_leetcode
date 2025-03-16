package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SubarraySumEqualsKTest {

    @Test
    fun subarraySum() {
        val solution = SubarraySumEqualsK()
        assertEquals(2, solution.subarraySum(intArrayOf(1,1,1), 2))
        assertEquals(2, solution.subarraySum(intArrayOf(1,2,3), 3))
    }
}