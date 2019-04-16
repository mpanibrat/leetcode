package com.panibrat.tree._653;

/*
653. Two Sum IV - Input is a BST

Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:
Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
Example 2:
Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False

 */

import com.panibrat.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 *
 * <pre>{@code
 * public class TreeNode {
 *   int val;
 *   TreeNode left;
 *   TreeNode right;
 *   TreeNode(int x) { val = x; }
 * }
 * }</pre>
 */
class Solution {
  public boolean findTarget(TreeNode root, int k) {
    List<Integer> list = new ArrayList<>();
    traverse(root, list);
    int i = 0;
    int j = list.size() - 1;
    while (i < j) {
      int sum = list.get(i) + list.get(j);
      if (sum == k) return true;
      if (sum < k) {
        i++;
      } else {
        j--;
      }
    }
    return false;
  }

  private void traverse(TreeNode root, List<Integer> list) {
    if (root == null) return;
    traverse(root.left, list);
    list.add(root.val);
    traverse(root.right, list);
  }
}
