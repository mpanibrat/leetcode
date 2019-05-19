package com.panibrat.tree;

public interface BinarySearchTree {
  static BinaryTree.TreeNode find(BinaryTree.TreeNode tree, int value) {
    if (tree == null || tree.val == value) {
      return tree;
    }
    if (tree.val > value) {
      return find(tree.left, value);
    }
    return find(tree.right, value);
  }
}
