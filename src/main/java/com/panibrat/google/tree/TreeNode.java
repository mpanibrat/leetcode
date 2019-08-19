package com.panibrat.google.tree;

import java.util.Iterator;

public class TreeNode<T> implements Iterable<T> {
  T value;
  TreeNode<T> left;
  TreeNode<T> right;

  TreeNode(T value) {
    this.value = value;
  }

  /**
   * Returns an iterator over elements of type {@code T}.
   *
   * @return an Iterator.
   */
  @Override
  public Iterator<T> iterator() {
    return new BinarySearchTreeIterator<>(this);
  }
}
