package com.panibrat.Minimum_Distance_Between_BST_Nodes_783

import com.panibrat.Common.TreeNode
import java.util.*
import kotlin.collections.ArrayList

/*
783. Minimum Distance Between BST Nodes

Given a Binary Search Tree (BST) with the root node root, return the minimum difference between the values of any two different nodes in the tree.

Example :

Input: root = [4,2,6,1,3,null,null]
Output: 1
Explanation:
Note that root is a TreeNode object, not an array.

The given tree [4,2,6,1,3,null,null] is represented by the following diagram:

          4
        /   \
      2      6
     / \
    1   3

while the minimum difference in this tree is 1, it occurs between node 1 and node 2, also between node 3 and node 2.

Note:

The size of the BST will be between 2 and 100.
The BST is always valid, each node's value is an integer, and each node's value is different.
 */


/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun minDiffInBST_Stack(root: TreeNode?): Int {
        val stack = LinkedList<TreeNode>()
        var min = Int.MAX_VALUE

        stack.pushAllLeft(root)
        var prev = stack.popNode().`val`

        while (stack.isNotEmpty()) {
            val node = stack.popNode()
            min = minOf(min, node.`val` - prev)
            prev = node.`val`
        }
        return min
    }

    private fun LinkedList<TreeNode>.pushAllLeft(root: TreeNode?) {
        var node = root
        while (node != null) {
            this.push(node)
            node = node.left
        }
    }

    private fun LinkedList<TreeNode>.popNode(): TreeNode {
        val node = this.pop()
        this.pushAllLeft(node.right)
        return node
    }

    fun minDiffInBST(root: TreeNode?): Int {
        var min = Int.MAX_VALUE
        val values = ArrayList<Int>()

        flatten(root, values)

        for (i in 1..values.lastIndex) {
            min = minOf(min, values[i] - values[i - 1])
        }
        return min
    }

    private fun flatten(node: TreeNode?, list: ArrayList<Int>) {
        if (node == null) return
        flatten(node.left, list)
        list.add(node.`val`)
        flatten(node.right, list)
    }
}