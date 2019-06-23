package com.panibrat.tree._572;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.panibrat.tree.BinaryTree;
import com.panibrat.tree.BinaryTree.TreeNode;
import org.junit.Test;

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
public class SolutionTest {

  @Test
  public void isSubtree() {
    TreeNode s = BinaryTree.of(3, 4, 5, 1, 2);
    TreeNode t = BinaryTree.of(4, 1, 2);
    assertTrue(new Solution().isSubtree(s, t));
  }

  @Test
  public void isSubtree_1() {
    TreeNode s = BinaryTree.of(3, 4, 5, 1, 2, null, null, null, null, 0);
    TreeNode t = BinaryTree.of(4, 1, 2);
    assertFalse(new Solution().isSubtree(s, t));
  }
  @Test
  public void isSubtree_2() {
    TreeNode s = BinaryTree.of(3,4,5,1,null,2);
    TreeNode t = BinaryTree.of(3, 1, 2);
    assertFalse(new Solution().isSubtree(s, t));
  }
}
