package daily

import Exercise


/**
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 */
class Daily20240206 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, arrayOf("eat","tea","tan","ate","nat","bat"), listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat, tea")))
        val test2 = runTest(2, arrayOf(""), listOf(listOf("")))
        val test3 = runTest(3, arrayOf("a"), listOf(listOf("a")))
        val test4 = runTest(4, arrayOf("cab","tin","pew","duh","may","ill","buy","bar","max","doc"), listOf(listOf("max"),listOf("buy"),listOf("doc"),listOf("may"),listOf("ill"),listOf("duh"),listOf("tin"),listOf("bar"),listOf("pew"),listOf("cab")))
        return test1 && test2 && test3 && test4
    }

    fun runTest(n: Int, testInput: Array<String>, test1Sol: List<List<String>>): Boolean {
        val testRes = groupAnagrams(testInput)
        val test = getString2<String>(testRes) == getString2<String>(test1Sol)
        println("Test $n: $test Res: ${testRes}, Sol: $test1Sol")
        return test
    }

    fun <T> getString(list: List<T>): String {
        return "[${list.joinToString()}]"
    }

    fun <T> getString2(list: List<List<T>>): String {
        return "[${list.joinToString { it.joinToString() }}]"
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy { it.toList().sorted() }.values.toList()
    }
}