package learn.hashing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FirstLetterAppearTwiceTest {

    @Test
    fun repeatedCharacter() {
        val solution = FirstLetterAppearTwice()
        assertEquals('c', solution.repeatedCharacter("abccbaacz"))
        assertEquals('d', solution.repeatedCharacter("abcdd"))
    }
}