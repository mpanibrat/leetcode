package com.panibrat.tree.Closest_Binary_Search_Tree_Value_270

import com.panibrat.tree.TreeNode

/*
270. Closest Binary Search Tree Value

Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

Note:
- Given target value is a floating point.
- You are guaranteed to have only one unique value in the BST that is closest to the target.
 */

/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun closestValue(root: TreeNode?, target: Double): Int {
        var closest = root!!.`val`
        var node = root
        while (node != null) {
            if (Math.abs(target - node.`val`) < Math.abs(target - closest)) closest = node.`val`
            node = if (node.`val` > target) node.left else node.right
        }
        return closest
    }
}
