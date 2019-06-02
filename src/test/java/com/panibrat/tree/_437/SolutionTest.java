package com.panibrat.tree._437;

import static org.junit.Assert.assertEquals;

import com.panibrat.tree.BinaryTree;
import com.panibrat.tree.BinaryTree.TreeNode;
import org.junit.Test;

/*
437. Path Sum III

You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

Example:

root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11
 */
public class SolutionTest {

  @Test
  public void pathSum_1() {
    TreeNode tree = BinaryTree.of(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
    assertEquals(3, new Solution().pathSum(tree, 8));
  }

  @Test
  public void pathSum_2() {
    TreeNode tree = BinaryTree.of(1, -2, -3, 1, 3, -2, null, -1);
    assertEquals(4, new Solution().pathSum(tree, -1));
  }

  @Test
  public void pathSum_3() {
    TreeNode tree = BinaryTree.of(1);
    assertEquals(0, new Solution().pathSum(tree, 0));
  }
}
