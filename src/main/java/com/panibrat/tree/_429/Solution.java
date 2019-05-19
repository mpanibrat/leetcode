package com.panibrat.tree._429;

import com.panibrat.tree.NaryTree.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
429. N-ary Tree Level Order Traversal

Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example, given a 3-ary tree:

      1
    / | \
  3   2   4
 / \       \
5   6       7


We should return its level order traversal:

[
     [1],
     [3,2,4],
     [5,6,7]
]
 */
class Solution {

  public List<List<Integer>> levelOrder(Node root) {
    return helper(new ArrayList<>(), 0, root);
  }

  private List<List<Integer>> helper(List<List<Integer>> list, int level, Node node) {
    if (node == null) {
      return list;
    }

    if (level < list.size()) {
      list.get(level).add(node.val);
    } else {
      List<Integer> values = new ArrayList<>();
      values.add(node.val);
      list.add(values);
    }

    for (Node n : node.children) {
      helper(list, level + 1, n);
    }

    return list;
  }

  public List<List<Integer>> levelOrder_iterative(Node root) {
    if (root == null) {
      return Collections.emptyList();
    }
    List<List<Integer>> result = new ArrayList<>();
    List<Node> queue = Collections.singletonList(root);
    while (!queue.isEmpty()) {
      List<Node> level = new ArrayList<>();
      List<Integer> values = new ArrayList<>();
      for (Node n : queue) {
        values.add(n.val);
        if (n.children != null) {
          level.addAll(n.children);
        }
      }
      result.add(values);
      queue = level;
    }
    return result;
  }
}