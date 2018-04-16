package com.panibrat.Diameter_of_Binary_Tree_543

import com.panibrat.Common.TreeNode

/*
543. Diameter of Binary Tree

Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.

 */

/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var diameter = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        depth(root)
        return diameter
    }

    private fun depth(root: TreeNode?): Int {
        if (root == null) return 0

        // post-order traversal
        val left = depth(root.left)
        val right = depth(root.right)

        diameter = maxOf(diameter, left + right)
        return 1 + maxOf(left, right)
    }
}