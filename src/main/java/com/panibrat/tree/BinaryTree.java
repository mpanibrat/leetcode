package com.panibrat.tree;

import java.util.Arrays;
import java.util.Collections;

public interface BinaryTree {

  static BinaryTree.TreeNode of(Integer... values) {
    return levelOrder(values, 0);
  }

  private static BinaryTree.TreeNode levelOrder(Integer[] arr, int i) {
    if (i >= arr.length || arr[i] == null) {
      return null;
    }
    BinaryTree.TreeNode node = new BinaryTree.TreeNode(arr[i]);
    node.left = levelOrder(arr, 2 * i + 1);
    node.right = levelOrder(arr, 2 * i + 2);
    return node;
  }

  class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  static void prettyPrint(TreeNode root) {
    TreePrinter.print(
        root,
        "",
        n -> n != null ? Arrays.asList(n.right, n.left) : Collections.emptyList(),
        n -> n != null ? Integer.toString(n.val) : "x",
        true);
  }
}
