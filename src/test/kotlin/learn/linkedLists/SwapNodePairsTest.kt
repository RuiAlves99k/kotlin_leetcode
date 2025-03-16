package learn.linkedLists

import model.ListNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SwapNodePairsTest {

    @Test
    fun swapPairs() {
        val solution = SwapNodePairs()
        val head = ListNode(1)
        val second = ListNode(2)
        head.next = second
        val third = ListNode(3)
        second.next = third
        val forth = ListNode(4)
        third.next = forth

        val headSolution = ListNode(2)
        val secondSolution = ListNode(1)
        headSolution.next = secondSolution
        val thirdSolution = ListNode(4)
        secondSolution.next = thirdSolution
        val forthSolution = ListNode(3)
        thirdSolution.next = forthSolution
        assertEquals(headSolution, solution.swapPairs(head))
    }
}