package learn.linkedLists

import model.ListNode

class ReverseLinkedList {
    fun reverseList(head: ListNode<Int>?): ListNode<Int>? {
        var prev : ListNode<Int>? = null
        var curr = head
        while (curr != null){
            val nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode
        }
        return prev
    }
}