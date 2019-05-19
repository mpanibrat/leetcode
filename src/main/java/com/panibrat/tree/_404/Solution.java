package com.panibrat.tree._404;

import com.panibrat.tree.BinaryTree.TreeNode;

/*
404. Sum of Left Leaves

Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
class Solution {

  public int sumOfLeftLeaves(TreeNode root) {
    return helper(root, false);
  }

  private int helper(TreeNode root, boolean left) {
    if (root == null) {
      return 0;
    }
    if (left && root.left == null && root.right == null) {
      return root.val;
    }
    return helper(root.left, true) + helper(root.right, false);
  }
}