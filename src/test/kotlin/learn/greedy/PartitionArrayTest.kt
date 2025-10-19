package learn.greedy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PartitionArrayTest {

    val solution = PartitionArray()

    @Test
    fun example1(){
        test(intArrayOf(3,6,1,2,5), 2, 2)
    }

    @Test
    fun example2(){
        test(intArrayOf(1,2,3), 1, 2)
    }

    @Test
    fun example3(){
        test(intArrayOf(2,2,4,5), 0, 3)
    }


    private fun test(nums: IntArray, k: Int, expected: Int){
        val res = solution.partitionArray(nums, k)
        assertEquals(expected, res)
    }

}