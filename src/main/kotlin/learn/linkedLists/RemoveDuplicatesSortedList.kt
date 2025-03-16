package learn.linkedLists

import model.ListNode

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * Example 1:
 * Input: head = [1,1,2]
 * Output: [1,2]
 * Example 2:
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 */
class RemoveDuplicatesSortedList {
    fun deleteDuplicates(head: ListNode<Int>?): ListNode<Int>? {
        var ptr = head
        while (ptr?.next != null) {
            if (ptr.next?.`val` == ptr.`val`){
                ptr.next = ptr.next?.next
            } else {
                ptr = ptr.next
            }
        }
        return head
    }
}