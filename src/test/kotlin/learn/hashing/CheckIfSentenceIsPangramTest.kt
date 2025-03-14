package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CheckIfSentenceIsPangramTest {

    @Test
    fun checkIfPangram() {
        val solution = CheckIfSentenceIsPangram()
        assertEquals(true, solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
        assertEquals(false, solution.checkIfPangram("leetcode"))
    }
}