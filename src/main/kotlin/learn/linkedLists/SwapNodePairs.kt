package learn.linkedLists

import model.ListNode

/**
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 *
 * Example 1:
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 * Explanation:
 *
 * Example 2:
 * Input: head = []
 * Output: []
 *
 * Example 3:
 * Input: head = [1]
 * Output: [1]
 *
 * Example 4:
 * Input: head = [1,2,3]
 * Output: [2,1,3]
 */
class SwapNodePairs {
    fun swapPairs(head: ListNode<Int>?): ListNode<Int>? {
//        var prev : ListNode<Int>? = null
//        var curr = head
//        var nodesSeen = 0
//        var ans = head
//        while (curr != null){
//            val nextNode = curr.next
//            if (++nodesSeen % 2 == 1 && nextNode != null){
//                if (nodesSeen == 1){
//                    ans = nextNode
//                }
//                prev?.next = nextNode
//                curr.next = nextNode?.next
//                nextNode?.next = curr
//            }
//            else {
//                prev = curr
//                curr = nextNode
//            }
//        }
//        return ans


        if (head?.next == null) {
            return head
        }
        val dummy = head.next
        var prev : ListNode<Int>? = null
        var curr = head
        while (curr != null && curr.next != null){
            if (prev != null){
                prev.next = curr.next
            }
            prev = curr

            val nextNode = curr.next?.next
            curr.next?.next = curr

            curr.next = nextNode
            curr = nextNode
        }
        return dummy
    }
}