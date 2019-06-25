package com.panibrat.tree._589;

import com.panibrat.tree.NaryTree.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
589. N-ary Tree Preorder Traversal

Given an n-ary tree, return the preorder traversal of its nodes' values.

For example, given a 3-ary tree:

        1
      / | \
     3  2  4
    / \
   5   6

Return its preorder traversal as: [1,3,5,6,2,4].


Note:
- Recursive solution is trivial, could you do it iteratively?
 */
class Solution {
  public List<Integer> preorder(Node root) {
    ArrayList<Integer> list = new ArrayList<>();
    iterative(root, list);
    return list;
  }

  private static void recursive(Node node, List<Integer> list) {
    if (node == null) {
      return;
    }
    list.add(node.val);
    for (Node n : node.children) {
      recursive(n, list);
    }
  }

  private static void iterative(Node root, List<Integer> list) {
    if (root == null) {
      return;
    }
    LinkedList<Node> nodes = new LinkedList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      Node node = nodes.remove();
      list.add(node.val);
      nodes.addAll(0, node.children);
    }
  }
}
