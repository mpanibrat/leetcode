package com.panibrat.tree._662;

import com.panibrat.tree.BinaryTree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/*
662. Maximum Width of Binary Tree

Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.

The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.

Example 1:

Input:

           1
         /   \
        3     2
       / \     \
      5   3     9

Output: 4
Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).

Example 2:

Input:

          1
         /
        3
       / \
      5   3

Output: 2
Explanation: The maximum width existing in the third level with the length 2 (5,3).

Example 3:

Input:

          1
         / \
        3   2
       /
      5

Output: 2
Explanation: The maximum width existing in the second level with the length 2 (3,2).

Example 4:

Input:

          1
         / \
        3   2
       /     \
      5       9
     /         \
    6           7
Output: 8
Explanation:The maximum width existing in the fourth level with the length 8 (6,null,null,null,null,null,null,7).


Note: Answer will in the range of 32-bit signed integer.
 */
class Solution {

  public int widthOfBinaryTree(TreeNode root) {
    return maxWidth(root, new ArrayList<>(), 0, 0);
  }

  private int maxWidth(TreeNode node, List<Integer> start, int level, int position) {
    if (node == null) {
      return 0;
    }
    if (start.size() == level) {
      start.add(position);
    }
    int width = position - start.get(level) + 1;
    int left = maxWidth(node.left, start, level + 1, position * 2);
    int right = maxWidth(node.right, start, level + 1, position * 2 + 1);
    return Math.max(width, Math.max(left, right));
  }
}
