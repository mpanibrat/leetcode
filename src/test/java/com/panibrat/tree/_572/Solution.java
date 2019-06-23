package com.panibrat.tree._572;

import com.panibrat.tree.BinaryTree.TreeNode;

/*
572. Subtree of Another Tree

Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.


Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.
 */
class Solution {
  public boolean isSubtree(TreeNode s, TreeNode t) {
    return equal(s, t, false);
  }

  private boolean equal(TreeNode s, TreeNode t, boolean comparing) {
    if (s == null || t == null) {
      return s == t;
    }
    if (comparing && s.val != t.val) {
      return false;
    }
    if (s.val == t.val && equal(s.left, t.left, true) && equal(s.right, t.right, true)) {
      return true;
    }
    return equal(s.left, t, false) || equal(s.right, t, false);
  }
}
