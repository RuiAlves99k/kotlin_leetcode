package daily

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class Daily20251018Test {

    val solution = Daily20251018()

    @Test
    fun test1() {
        val res = solution.maxDistinctElements(intArrayOf(1,2,2,3,3,4), 2)
        assertEquals(6, res)
    }

    @Test
    fun test2(){
        val res = solution.maxDistinctElements(intArrayOf(4,4,4,4), 1)
        assertEquals(3, res)
    }

    @Test
    fun test3(){
        val res = solution.maxDistinctElements(intArrayOf(8,7,8,7,10), 1)
        assertEquals(5, res)
    }

}