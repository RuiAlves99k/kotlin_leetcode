package daily

import Exercise
import java.util.SortedMap


/**
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.



Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 */
class Daily20240207 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, "tree", "eert")
        val test2 = runTest(2, "cccaaa", "aaaccc")
        val test3 = runTest(3, "Aabb", "bbAa")
        return test1 && test2 && test3
    }

    fun runTest(n: Int, testInput: String, test1Sol: String): Boolean {
        val testRes = frequencySort(testInput)
        val test = testRes == test1Sol
        println("Test $n: $test Res: ${testRes}, Sol: $test1Sol")
        return test
    }

    fun <T> getString(list: List<T>): String {
        return "[${list.joinToString()}]"
    }

    fun <T> getString2(list: List<List<T>>): String {
        return "[${list.joinToString { it.joinToString() }}]"
    }

    fun frequencySort(s: String): String {
        var finalString = ""
        s.groupingBy { it }.eachCount().toList().sortedWith(compareByDescending<Pair<Char, Int>> { pair -> pair.second }).forEach {
            finalString += CharArray(it.second) {ch -> it.first}.joinToString("")
        }
        return finalString
    }
}