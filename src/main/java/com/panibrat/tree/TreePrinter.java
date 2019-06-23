package com.panibrat.tree;

import java.util.List;
import java.util.function.Function;

public interface TreePrinter {

  static <T> void print(
      T node,
      String prefix,
      Function<T, List<T>> getChildren,
      Function<T, String> toString,
      boolean last) {
    String nodeConnection = last ? "└── " : "├── ";
    System.out.println(prefix + nodeConnection + toString.apply(node));
    List<T> children = getChildren.apply(node);
    for (int i = 0; i < children.size(); i++) {
      String newPrefix = prefix + (last ? "    " : "│   ");
      print(children.get(i), newPrefix, getChildren, toString, i == children.size() - 1);
    }
  }
}
