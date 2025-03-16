package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FindPlayersWithZeroOneLossesTest {

    @Test
    fun findWinners() {
        val solution = FindPlayersWithZeroOneLosses()
        assertArrayEquals(
            arrayOf(listOf(1, 2, 10), listOf(4, 5, 7, 8)),
            solution.findWinners(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(2, 3),
                    intArrayOf(3, 6),
                    intArrayOf(5, 6),
                    intArrayOf(5, 7),
                    intArrayOf(4, 5),
                    intArrayOf(4, 8),
                    intArrayOf(4, 9),
                    intArrayOf(10, 4),
                    intArrayOf(10, 9)
                )
            ).toTypedArray()
        )
        assertArrayEquals(
            arrayOf(listOf(1, 2, 5, 6), listOf()),
            solution.findWinners(
                arrayOf(
                    intArrayOf(2, 3),
                    intArrayOf(1, 3),
                    intArrayOf(5, 4),
                    intArrayOf(6, 4),
                )
            ).toTypedArray()
        )
    }
}