package com.panibrat.google.tree;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * BinarySearchTree in-order iterator.
 *
 * @param <T> yhe type of values
 */
public class BinarySearchTreeIterator<T> implements Iterator<T> {

  private Deque<TreeNode<T>> stack = new LinkedList<>();

  BinarySearchTreeIterator(TreeNode<T> root) {
    addLeft(root);
  }

  /**
   * Returns {@code true} if the iteration has more elements. (In other words, returns {@code true}
   * if {@link #next} would return an element rather than throwing an exception.)
   *
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration
   * @throws NoSuchElementException if the iteration has no more elements
   */
  @Override
  public T next() {
    if (stack.isEmpty()) {
      throw new NoSuchElementException();
    }
    TreeNode<T> node = stack.pop();
    addLeft(node.right);
    return node.value;
  }

  private void addLeft(TreeNode<T> node) {
    while (node != null) {
      stack.push(node);
      node = node.left;
    }
  }
}
