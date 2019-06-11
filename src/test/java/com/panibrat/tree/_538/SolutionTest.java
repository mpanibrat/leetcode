package com.panibrat.tree._538;

import static org.assertj.core.api.Assertions.assertThat;

import com.panibrat.tree.BinaryTree;
import com.panibrat.tree.BinaryTree.TreeNode;
import org.junit.Test;

/*
538. Convert BST to Greater Tree

Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13

 */
public class SolutionTest {

  @Test
  public void convertBST() {
    TreeNode input = BinaryTree.of(5, 2, 13);
    TreeNode control = BinaryTree.of(18, 20, 13);
    assertThat(new Solution().convertBST(input)).isEqualToComparingFieldByFieldRecursively(control);
  }

  @Test
  public void convertBST_complicated() {
    TreeNode input = BinaryTree.of(5, 2, 13, null, null, 10);
    TreeNode control = BinaryTree.of(28, 30, 13, null, null, 23);
    assertThat(new Solution().convertBST(input)).isEqualToComparingFieldByFieldRecursively(control);
  }
}
