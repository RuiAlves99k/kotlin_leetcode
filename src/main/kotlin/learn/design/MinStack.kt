package learn.design

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 */
class MinStack {
    var top: Node? = null
    fun push(`val`: Int) {
        val min: Int = top?.min?.let {
            if (`val` < it) `val`
            else it
        } ?: `val`
        val node = Node(`val`, min)
        node.next = top
        top = node
    }

    fun pop() {
        top = top?.next
    }

    fun top(): Int {
        return top?.value ?: throw IllegalStateException("No values")
    }

    fun getMin(): Int {
        return top?.min ?: throw IllegalStateException("No values")
    }
}

data class Node(
    val value: Int, val min: Int, var next: Node? = null
)