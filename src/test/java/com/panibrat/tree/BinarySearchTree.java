package com.panibrat.tree;

public class BinarySearchTree {

  public static TreeNode of(Integer... values) {
    return levelOrder(values, 0);
  }

  private static TreeNode levelOrder(Integer[] arr, int i) {
    if (i >= arr.length || arr[i] == null) {
      return null;
    }
    TreeNode node = new TreeNode(arr[i]);
    node.left = levelOrder(arr, 2 * i + 1);
    node.right = levelOrder(arr, 2 * i + 2);
    return node;
  }

  public static TreeNode find(TreeNode tree, int value) {
    if (tree == null || tree.val == value) {
      return tree;
    }
    if (tree.val > value) {
      return find(tree.left, value);
    }
    return find(tree.right, value);
  }
}
