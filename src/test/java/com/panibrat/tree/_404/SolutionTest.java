package com.panibrat.tree._404;

import static org.junit.Assert.assertEquals;

import com.panibrat.tree.BinarySearchTree;
import com.panibrat.tree.BinaryTree.TreeNode;
import org.junit.Test;

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
public class SolutionTest {

  @Test
  public void sumOfLeftLeaves() {
    TreeNode tree = BinarySearchTree.of(3, 9, 20, null, null, 15, 7);
    assertEquals(24, new Solution().sumOfLeftLeaves(tree));
  }
}