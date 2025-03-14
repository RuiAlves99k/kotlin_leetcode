package learn.arrayStrings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReverseWordsStringIIITest {

    @Test
    fun reverseWords() {
        val solution = ReverseWordsStringIII()
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"))
        assertEquals("rM gniD", solution.reverseWords("Mr Ding"))
    }
}