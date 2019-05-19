package com.panibrat.tree._111;
/*
111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its minimum depth = 2.
 */

import com.panibrat.tree.BinaryTree.TreeNode;

class Solution {
  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = minDepth(root.left);
    int right = minDepth(root.right);
    int minDepth = left == 0 || right == 0 ? left + right : Math.min(left, right);
    return 1 + minDepth;
  }
}
