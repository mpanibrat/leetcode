package com.panibrat.tree._590;

import com.panibrat.tree.NaryTree.Node;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
590. N-ary Tree Postorder Traversal

Given an n-ary tree, return the postorder traversal of its nodes' values.

For example, given a 3-ary tree:

        1
      / | \
     3  2  4
    / \
   5   6


Return its postorder traversal as: [5,6,3,2,4,1].


Note:

Recursive solution is trivial, could you do it iteratively?

 */
class Solution {
  public List<Integer> postorder(Node root) {
    LinkedList<Integer> list = new LinkedList<>();
    iterative(root, list);
    return list;
  }

  private void recursive(Node node, List<Integer> list) {
    if (node == null) {
      return;
    }
    for (Node child : node.children) {
      recursive(child, list);
    }
    list.add(node.val);
  }

  private void iterative(Node node, LinkedList<Integer> list) {
    if (node == null) {
      return;
    }
    Deque<Node> stack = new LinkedList<>();
    stack.push(node);

    while (!stack.isEmpty()) {
      Node n = stack.pop();
      list.addFirst(n.val);
      for (Node child : n.children) {
        stack.push(child);
      }
    }
  }
}
