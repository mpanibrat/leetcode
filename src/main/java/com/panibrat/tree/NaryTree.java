package com.panibrat.tree;

import java.util.Collections;
import java.util.List;

public interface NaryTree {

  class Node {

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int val, List<Node> children) {
      this.val = val;
      this.children = children;
    }
  }

  static void prettyPrint(Node root) {
    TreePrinter.print(
        root,
        "",
        n -> n != null ? n.children : Collections.emptyList(),
        n -> n != null ? Integer.toString(n.val) : "x",
        true);
  }
}
