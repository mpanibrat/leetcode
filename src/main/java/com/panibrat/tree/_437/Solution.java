package com.panibrat.tree._437;

import com.panibrat.tree.BinaryTree.TreeNode;
import java.util.HashMap;
import java.util.Map;

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
class Solution {

  /* O(n^2) DFS */
  public int pathSumBruteforce(TreeNode root, int sum) {
    if (root == null) {
      return 0;
    }
    return dfs(root, sum) + pathSumBruteforce(root.left, sum) + pathSumBruteforce(root.right, sum);
  }

  private int dfs(TreeNode node, int sum) {
    if (node == null) {
      return 0;
    }
    int current = node.val == sum ? 1 : 0;
    return current + dfs(node.left, sum - node.val) + dfs(node.right, sum - node.val);
  }

  /* O(n) Cumulative sum with HashMap counter */
  public int pathSum(TreeNode root, int sum) {
    Map<Integer, Integer> sumCount = new HashMap<>();
    sumCount.put(0, 1);
    return helper(root, sumCount, 0, sum);
  }

  private int helper(TreeNode node, Map<Integer, Integer> sumCount, int current, int target) {
    if (node == null) {
      return 0;
    }
    int sum = current + node.val;
    int count = sumCount.getOrDefault(sum - target, 0);

    int tmp = sumCount.getOrDefault(sum, 0);
    sumCount.put(sum, tmp + 1);
    int left = helper(node.left, sumCount, sum, target);
    int right = helper(node.right, sumCount, sum, target);
    sumCount.put(sum, tmp);

    return count + left + right;
  }
}
