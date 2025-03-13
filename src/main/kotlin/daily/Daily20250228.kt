package daily

import Exercise
import java.lang.Integer.max
import kotlin.math.min

/**

 */
class Daily20250228 : Exercise {
    class Solution {
        fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
            val list = mutableListOf<Int>()
            val setValues = sortedSetOf<Int>()
            grid.forEach { gridList ->
                gridList.forEach {
                    if (setValues.contains(it)) {
                        list.add(it)
                    }
                    setValues.add(it)
                }
            }
            if (setValues.size == setValues.last()) {
                list.add(setValues.size + 1)
            } else {
                var i  = 0
                while (i < setValues.size && list.size < 2){
                    val value = setValues.elementAt(i)
                    if (i + 1 != value) {
                        list.add(i + 1)
                    }
                    i++
                }

            }
            return list.toIntArray()
        }
    }

    override fun start(): Boolean {
        val solution = Solution()
        val inputs = listOf(Pair("aaaaaaaa", "aaaaaaaa"))
        val result = solution.findMissingAndRepeatedValues(arrayOf(intArrayOf(9,1,7), intArrayOf(8,9,2), intArrayOf(3,4,6)))
        return result.contentEquals(intArrayOf(2,4))
    }
}

