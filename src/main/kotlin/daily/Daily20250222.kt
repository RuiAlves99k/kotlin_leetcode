package daily

import Exercise

/**
We run a preorder depth-first search (DFS) on the root of a binary tree.

At each node in this traversal, we output D dashes (where D is the depth of this node), then we output the value of this node.  If the depth of a node is D, the depth of its immediate child is D + 1.  The depth of the root node is 0.

If a node has only one child, that child is guaranteed to be the left child.

Given the output traversal of this traversal, recover the tree and return its root.



Example 1:


Input: traversal = "1-2--3--4-5--6--7"
Output: [1,2,5,3,4,6,7]
Example 2:


Input: traversal = "1-2--3---4-5--6---7"
Output: [1,2,5,3,null,6,null,4,null,7]
Example 3:


Input: traversal = "1-401--349---90--88"
Output: [1,401,null,349,88,90]


Constraints:

The number of nodes in the original tree is in the range [1, 1000].
1 <= Node.val <= 109
 */
class Daily20250222 : Exercise {
    /**
     * Example:
     * var ti = TreeNode(5)
     * var v = ti.`val`
     * Definition for a binary tree node.
     */
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    class Solution {
        fun recoverFromPreorder(traversal: String): TreeNode? {
            if (traversal.isEmpty()) return null
            val root = TreeNode(traversal[0].digitToInt())
            fillTree(root, 1, traversal.removeRange(0..0))
            return root
        }

        fun fillTree(node: TreeNode?, depth: Int, traversal: String): String {
            var tempTraversal = traversal
            if (node == null || depth >= tempTraversal.length) return tempTraversal

            if (tempTraversal[depth] != '-' && tempTraversal.startsWith("-".repeat(depth))){
                val value = tempTraversal.split("-".repeat(depth))[1]
                tempTraversal = tempTraversal.removeRange(0..depth + value.length)
                node.left = TreeNode(value.toInt())
            } else return tempTraversal
            tempTraversal = fillTree(node.left, depth + 1, tempTraversal)


            if (depth >= tempTraversal.length) return tempTraversal
            if (tempTraversal[depth] != '-' && tempTraversal.startsWith("-".repeat(depth))){
                val value = tempTraversal.split("-".repeat(depth))[1]
                tempTraversal = tempTraversal.removeRange(0..depth + value.length)
                node.right = TreeNode(value.toInt())
            } else return tempTraversal
            return fillTree(node.right, depth + 1, tempTraversal)
        }


    }

    override fun start(): Boolean {
        val obj = Solution()
        val returnedValue = obj.recoverFromPreorder("1-2--3---4-5--6---7")
        // [1,2,5,3,null,6,null,4,null,7]
        val result = TreeNode(1)
        result.left = TreeNode(2).run {
            this.left = TreeNode(3)
            this.right = TreeNode(4)
            this
        }
        result.right = TreeNode(5).run {
            this.left = TreeNode(6)
            this.right = TreeNode(7)
            this
        }
        return result == returnedValue
    }
}

