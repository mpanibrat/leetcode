package com.panibrat.google.tree;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TreeNodeTest {

  @Test
  public void iterator() {
    TreeNode<Integer> n1 = new TreeNode<>(1);
    TreeNode<Integer> n2 = new TreeNode<>(2);
    TreeNode<Integer> n3 = new TreeNode<>(3);
    TreeNode<Integer> n4 = new TreeNode<>(4);
    TreeNode<Integer> n5 = new TreeNode<>(5);
    TreeNode<Integer> n6 = new TreeNode<>(6);
    TreeNode<Integer> n7 = new TreeNode<>(7);
    TreeNode<Integer> n8 = new TreeNode<>(8);
    TreeNode<Integer> n9 = new TreeNode<>(9);
    n1.right = n2;
    n3.left = n1;
    n3.right = n4;
    n5.left = n3;
    n5.right = n8;
    n8.left = n6;
    n8.right = n9;
    n6.right = n7;

    assertThat(n5).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
  }
}
