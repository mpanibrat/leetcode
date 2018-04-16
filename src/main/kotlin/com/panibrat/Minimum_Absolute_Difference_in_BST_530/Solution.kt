package com.panibrat.Minimum_Absolute_Difference_in_BST_530

import com.panibrat.Common.TreeNode

/*
530. Minimum Absolute Difference in BST

Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
Note: There are at least two nodes in this BST.

 */

/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var min = Int.MAX_VALUE
    var prev: Int? = null

    fun getMinimumDifference(root: TreeNode?): Int {
        if (root == null) return -1

        getMinimumDifference(root.left)

        if (prev != null) min = minOf(min, root.`val` - prev!!)
        prev = root.`val`

        getMinimumDifference(root.right)

        return min
    }
}