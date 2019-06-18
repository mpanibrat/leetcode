package com.panibrat.tree._563;

import static org.assertj.core.api.Assertions.assertThat;

import com.panibrat.tree.BinaryTree;
import com.panibrat.tree.BinaryTree.TreeNode;
import org.junit.Test;

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
public class SolutionTest {

  @Test
  public void findTilt() {
    TreeNode tree = BinaryTree.of(1, 2, 3);
    assertThat(new Solution().findTilt(tree)).isEqualTo(1);
  }

  @Test
  public void findTilt_empty() {
    TreeNode tree = BinaryTree.of();
    assertThat(new Solution().findTilt(tree)).isEqualTo(0);
  }

  @Test
  public void findTilt_half() {
    TreeNode tree = BinaryTree.of(1, 2, 3, 4, null, 5, null);
    assertThat(new Solution().findTilt(tree)).isEqualTo(11);
  }
}
