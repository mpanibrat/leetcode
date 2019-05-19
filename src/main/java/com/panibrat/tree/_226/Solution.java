package com.panibrat.tree._226;

/*
226. Invert Binary Tree

Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1

 */

import com.panibrat.tree.BinaryTree.TreeNode;

/**
 * Definition for a binary tree node.
 * <pre>
 * {@code
 * public class TreeNode {
 *   int val;
 *   TreeNode left;
 *   TreeNode right;
 *   TreeNode(int x) { val = x; }
 * }
 * }
 * </pre>
 */
class Solution {
  private TreeNode invertTree(TreeNode root) {
    if (root == null) return root;
    TreeNode tmp = root.left;
    root.left = root.right;
    root.right = tmp;
    invertTree(root.left);
    invertTree(root.right);
    return root;
  }
}
