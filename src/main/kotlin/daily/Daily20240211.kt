package daily

import Exercise
import java.util.SortedMap
import kotlin.math.max
import kotlin.math.pow

/**
You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents the number of cherries that you can collect from the (i, j) cell.

You have two robots that can collect cherries for you:

Robot #1 is located at the top-left corner (0, 0), and
Robot #2 is located at the top-right corner (0, cols - 1).
Return the maximum number of cherries collection using both robots by following the rules below:

From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
When both robots stay in the same cell, only one takes the cherries.
Both robots cannot move outside of the grid at any moment.
Both robots should reach the bottom row in grid.
 */
class Daily20240211 : Exercise {
    override fun start(): Boolean {
        val test1 = runTest(1, arrayOf(intArrayOf(3,1,1), intArrayOf(2,5,1), intArrayOf(1,5,5), intArrayOf(2,1,1)), 24)
        val test2 = runTest(2, arrayOf(intArrayOf(1,0,0,0,0,0,1), intArrayOf(2,0,0,0,0,3,0), intArrayOf(2,0,9,0,0,0,0), intArrayOf(0,3,0,5,4,0,0), intArrayOf(1,0,2,3,0,0,6)), 28)
        return test1 && test2
    }

    fun runTest(n: Int, testInput: Array<IntArray>, test1Sol: Int): Boolean {
        val testRes = cherryPickup(testInput)
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

    fun cherryPickup(grid: Array<IntArray>): Int {
        var cherries = 0
        val rows = grid.size - 1
        val cols = grid[0].size - 1
        var row = 0
        var leftRobotCol = 0
        var rightRobotCol = cols

        var biggestLeftRobot = 0
        var biggestRightRobot = 0
        var maxCherries = 0
        while (row <= rows) {
            maxCherries = 0
            for (i in -1..1) {
                var tempColLeftRobot = (leftRobotCol + i).coerceAtLeast(0).coerceAtMost(cols)
                for (j in -1..1) {
                    var tempColRightRobot = (rightRobotCol + j).coerceAtLeast(0).coerceAtMost(cols)
                    if (tempColLeftRobot != tempColRightRobot && grid[row][tempColLeftRobot] + grid[row][tempColRightRobot] > maxCherries){
                        biggestLeftRobot = tempColLeftRobot
                        biggestRightRobot = tempColRightRobot
                        maxCherries = grid[row][tempColLeftRobot] + grid[row][tempColRightRobot]
                    }
                }
            }
            println("Left: $biggestLeftRobot, Right: $biggestRightRobot = $maxCherries")
            leftRobotCol = biggestLeftRobot
            rightRobotCol = biggestRightRobot
            cherries += maxCherries
            row++
        }
        return cherries
    }
}

