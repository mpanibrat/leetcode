package com.panibrat.tree._333;

/*
333. Largest BST Subtree

Given a binary tree, find the largest subtree which is a Binary Search Tree (BST), where largest means subtree with largest number of nodes in it.

Note:
A subtree must include all of its descendants.

Example:

Input: [10,5,15,1,8,null,7]

   10
   / \
  5  15
 / \   \
1   8   7

Output: 3
Explanation: The Largest BST Subtree in this case is the highlighted one.
             The return value is the subtree's size, which is 3.
Follow up:
Can you figure out ways to solve it with O(n) time complexity?

 */

import com.panibrat.tree.BinaryTree.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {
  private int depth;

  public int largestBSTSubtree(TreeNode root) {
    depth = 0;
    if (isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE)) return depth;
    return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));
  }

  private boolean isBST(TreeNode root, int max, int min) {
    if (root == null) return true;
    depth += 1;
    if (root.val >= max || root.val <= min) return false;
    return isBST(root.left, root.val, min) && isBST(root.right, max, root.val);
  }
}
