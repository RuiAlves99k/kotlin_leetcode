package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class KRadiusSubarrayAveragesTest {

    @Test
    fun getAverages() {
        val solution =  KRadiusSubarrayAverages()
        assertArrayEquals(intArrayOf(-1,-1,-1,5,4,4,-1,-1,-1), solution.getAverages(intArrayOf(7,4,3,9,1,8,5,2,6), 3))
    }
}