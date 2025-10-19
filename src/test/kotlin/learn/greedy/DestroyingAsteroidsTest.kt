package learn.greedy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DestroyingAsteroidsTest {

    val solution = DestroyingAsteroids()
    @Test
    fun Example1(){
        val res = solution.asteroidsDestroyed(10, intArrayOf(3,9,19,5,21))
        assertEquals(true, res)
    }

    @Test
    fun Example2(){
        val res = solution.asteroidsDestroyed(5, intArrayOf(4, 9, 23, 4))
        assertEquals(false, res)
    }

}