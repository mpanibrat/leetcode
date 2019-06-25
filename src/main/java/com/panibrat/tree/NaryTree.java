package com.panibrat.tree;

import java.util.ArrayList;
import java.util.Arrays;
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

  static Node of(int value, Node... children) {
    return new Node(value, Arrays.asList(children));
  }

  static Node of(int value, int... children) {
    Node[] nodes = Arrays.stream(children).mapToObj(NaryTree::leaf).toArray(Node[]::new);
    return of(value, nodes);
  }

  static Node leaf(int value) {
    return new Node(value, new ArrayList<>());
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
