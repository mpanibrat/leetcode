package com.panibrat.tree._563;

import com.panibrat.tree.BinaryTree.TreeNode;

/*
563. Binary Tree Tilt

Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.

Example:
Input:
         1
       /   \
      2     3
Output: 1
Explanation:
Tilt of node 2 : 0
Tilt of node 3 : 0
Tilt of node 1 : |2-3| = 1
Tilt of binary tree : 0 + 0 + 1 = 1

Note:
1. The sum of node values in any subtree won't exceed the range of 32-bit integer.
2. All the tilt values won't exceed the range of 32-bit integer.

 */
class Solution {
  public int findTilt(TreeNode root) {
    return traverse(root).tilt;
  }

  private static Tuple traverse(TreeNode node) {
    if (node == null) {
      return Tuple.ZEROS;
    }
    Tuple left = traverse(node.left);
    Tuple right = traverse(node.right);
    int tilt = left.tilt + right.tilt + Math.abs(left.sum - right.sum);
    int sum = node.val + left.sum + right.sum;
    return new Tuple(sum, tilt);
  }

  static class Tuple {
    private static final Tuple ZEROS = new Tuple(0, 0);

    final int sum;
    final int tilt;

    Tuple(int sum, int tilt) {
      this.sum = sum;
      this.tilt = tilt;
    }
  }
}
