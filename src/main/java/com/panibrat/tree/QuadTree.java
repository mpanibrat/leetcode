package com.panibrat.tree;

public interface QuadTree {

  /**
   * Definition for a QuadTree node.
   */
  class Node {

    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {
    }

    public Node(boolean val, boolean isLeaf,
        Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
      this.val = val;
      this.isLeaf = isLeaf;
      this.topLeft = topLeft;
      this.topRight = topRight;
      this.bottomLeft = bottomLeft;
      this.bottomRight = bottomRight;
    }
  }

}