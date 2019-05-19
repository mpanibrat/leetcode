package com.panibrat.tree;

import java.util.List;

public interface NaryTree {

  class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val, List<Node> children) {
      this.val = val;
      this.children = children;
    }
  }
}
