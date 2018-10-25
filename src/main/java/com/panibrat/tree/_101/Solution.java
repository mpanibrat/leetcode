package com.panibrat.tree._101;

/*
101. Symmetric Tree

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
 */

import com.panibrat.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public boolean isSymmetric(TreeNode root) {
    return recursive(root, root);
    // return iterative(root);
  }

  private boolean recursive(TreeNode p, TreeNode q) {
    if (p == null || q == null) return p == q;
    return p.val == q.val && recursive(p.left, q.right) && recursive(p.right, q.left);
  }

  private boolean iterative(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode p = queue.poll();
      TreeNode q = queue.poll();
      if (p == null && q == null) continue;
      if (p == null || q == null || p.val != q.val) return false;
      queue.add(p.left);
      queue.add(q.right);
      queue.add(p.right);
      queue.add(q.left);
    }
    return true;
  }
}