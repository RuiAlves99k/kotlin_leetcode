package daily

import Exercise


/**
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 *
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 *
 *
 *
 * Example 1:
 *
 * Input: low = 100, high = 300
 * Output: [123,234]
 * Example 2:
 *
 * Input: low = 1000, high = 13000
 * Output: [1234,2345,3456,4567,5678,6789,12345]
 */
class Daily20240202 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, 100, 300, listOf(123, 234))
        val test2 = runTest(2, 1000, 13000, listOf(1234, 2345, 3456, 4567, 5678, 6789, 12345))
        val test3 = runTest(3, 10, 1000000000, listOf(12,23,34,45,56,67,78,89,123,234,345,456,567,678,789,1234,2345,3456,4567,5678,6789,12345,23456,34567,45678,56789,123456,234567,345678,456789,1234567,2345678,3456789,12345678,23456789,123456789))
        return test1 && test2
    }

    fun runTest(n: Int, testInput: Int, testInput2: Int, test1Sol: List<Int>): Boolean {
        val testRes = sequentialDigits(testInput, testInput2)
        val test = getString(testRes) == getString(test1Sol)
        println("Test $n: $test Res: ${getString(testRes)}, Sol: ${getString(test1Sol)}")
        return test
    }

    fun getString(list: List<Int>): String {
        return "[${list.joinToString()}]"
    }

    fun sequentialDigits(low: Int, high: Int): List<Int> {
        val a: MutableList<Int> = ArrayList()

        for (i in 1..9) {
            var num = i
            var nextDigit = i + 1

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit
                println(num)
                if (num in low..high) {
                    a.add(num)
                }
                ++nextDigit
            }
        }

        a.sort()
        return a
    }

    fun sequentialDigits2(low: Int, high: Int): List<Int> {
        val digits = "123456789"
        val numDigitsHigh = high.toString().count()
        val finalList = mutableListOf<Int>()
        var formValue = ""
        for (tempNumDig in low.toString().count()..numDigitsHigh) {
            for (i in digits.indices) {
                formValue = ""
                for (j in 0 until tempNumDig) {
                    if (i + j >= digits.length)
                        break
                    formValue += digits[i + j]
                }
                if (formValue.length >= tempNumDig && formValue.toInt() in low..high) {
                    finalList.add(formValue.toInt())
                }
            }
        }
        return finalList
    }
}