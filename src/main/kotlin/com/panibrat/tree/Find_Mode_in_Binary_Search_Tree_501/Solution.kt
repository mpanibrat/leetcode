package com.panibrat.tree.Find_Mode_in_Binary_Search_Tree_501

import com.panibrat.tree.TreeNode

/*
501. Find Mode in Binary Search Tree

Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).

 */

/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    private var modes: IntArray? = null
    private var currVal: Int? = null
    private var currCount = 0
    private var maxCount = 0
    private var modeCount = 0


    fun findMode(root: TreeNode?): IntArray {
        root?.inorder { process(it) }
        modes = IntArray(modeCount)
        modeCount = 0
        currCount = 0
        root?.inorder { process(it) }
        return modes!!
    }

    private fun process(`val`: Int) {
        if (`val` != currVal) {
            currVal = `val`
            currCount = 0
        }
        currCount++
        if (currCount == maxCount) {
            modes?.let { modes!![modeCount] = currVal!! }
            modeCount++
        } else if (currCount > maxCount) {
            maxCount = currCount
            modeCount = 1
        }
    }
}

private fun TreeNode.inorder(function: (Int) -> Unit) {
    this.left?.inorder(function)
    function(this.`val`)
    this.right?.inorder(function)
}
