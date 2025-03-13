package others

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    fun lengthOfLongestSubstring() {
        val solution = LongestSubstringWithoutRepeatingCharacters()
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"))
    }
}