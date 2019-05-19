package com.panibrat.tree._872;
/*
872. Leaf-Similar Trees

Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.


For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.


Note:

Both of the given trees will have between 1 and 100 nodes.
*/

import com.panibrat.tree.BinaryTree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * <pre>
 * {@code
 * public class TreeNode {
 *   int val;
 *   TreeNode left;
 *   TreeNode right;
 *   TreeNode(int x) { val = x; }
 * }
 * }
 * </pre>
 */
class Solution {
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    getLeafs(root1, l1);
    getLeafs(root2, l2);
    return l1.equals(l2);
  }

  private void getLeafs(TreeNode root, List<Integer> list) {
    if (root == null) return;
    if (root.left == null && root.right == null) {
      list.add(root.val);
    }
    getLeafs(root.left, list);
    getLeafs(root.right, list);
  }
}
