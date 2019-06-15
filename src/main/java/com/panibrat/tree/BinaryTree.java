package com.panibrat.tree;

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

  static String toString(TreeNode node) {
    return write(new StringBuilder(), "", node).toString();
  }

  private static StringBuilder write(StringBuilder builder, String prefix, TreeNode node) {
    if (node == null) {
      return builder;
    }
    write(builder, prefix + "     ", node.right);
    builder.append(prefix).append("|-- ").append(node.val).append("\n");
    write(builder, prefix + "     ", node.left);
    return builder;
  }
}
