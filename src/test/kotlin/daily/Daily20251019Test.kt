package daily

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Daily20251019Test {

    val solution = Daily20251019()

    private fun test(s: String, a: Int, b: Int, expect: String) {
        assertEquals(expect, solution.findLexSmallestString(s, a, b))
    }

    @Test
    fun example1(){
        test("5525", 9, 2, "2050")
    }

    @Test
    fun example2(){
        test("74", 5, 1, "24")
    }

    @Test
    fun example3(){
        test("0011", 4, 2, "0011")
    }

    @Test
    fun example4(){
        test("5562438547", 1,3, "0014305132")
    }
}