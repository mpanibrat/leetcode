package com.panibrat.tree.Binary_Tree_Paths_257

import com.panibrat.tree.TreeNode

/*
257. Binary Tree Paths

Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]

 */

/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val list = ArrayList<String>()
        if (root !== null) traverse(root, "", list)
        return list
    }

    private fun traverse(node: TreeNode, path: String, list: ArrayList<String>) {
        val currentPath = "$path${node.`val`}"
        node.isLeaf { list.add(currentPath) }
        node.left.notNull { traverse(it, "$currentPath->", list) }
        node.right.notNull { traverse(it, "$currentPath->", list) }
    }
}

private fun TreeNode.isLeaf(f: (it: TreeNode) -> Unit) {
    if (this.left == null && this.right == null) f(this)
}

private fun <T : Any> T?.notNull(f: (it: T) -> Unit) {
    if (this != null) f(this)
}
