package com.panibrat.tree._307;

/*
307. Range Sum Query - Mutable

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

The update(i, val) function modifies nums by updating the element at index i to val.

Example:

Given nums = [1, 3, 5]

sumRange(0, 2) -> 9
update(1, 2)
sumRange(0, 2) -> 8

Note:

- The array is only modifiable by the update function.
- You may assume the number of calls to update and sumRange function is distributed evenly.
 */
public class SegmentTreeNumArrayImpl implements NumArray {

  private Node root;

  SegmentTreeNumArrayImpl(int[] nums) {
    root = build(nums, 0, nums.length - 1);
  }

  private static int middle(int left, int right) {
    return left + (right - left) / 2;
  }

  private Node build(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }
    Node node = new Node(start, end);
    if (start == end) {
      node.value = nums[start];
    } else {
      int middle = middle(start, end);
      node.left = build(nums, start, middle);
      node.right = build(nums, middle + 1, end);
      node.value = node.left.value + node.right.value;
    }
    return node;
  }

  private void update(Node node, int index, int value) {
    if (node.start == node.end) {
      node.value = value;
      return;
    }
    int middle = middle(node.start, node.end);
    if (index <= middle) {
      update(node.left, index, value);
    } else {
      update(node.right, index, value);
    }
    node.value = node.left.value + node.right.value;
  }

  private int sumRange(Node node, int start, int end) {
    if (node.start == start && node.end == end) {
      return node.value;
    }
    int middle = middle(root.start, root.end);
    if (end <= middle) {
      return sumRange(node.left, start, end);
    } else if (start > middle) {
      return sumRange(node.right, start, end);
    } else {
      return sumRange(node.left, start, middle) + sumRange(node.right, middle + 1, end);
    }
  }

  @Override
  public void update(int i, int val) {
    update(root, i, val);
  }

  @Override
  public int sumRange(int i, int j) {
    return sumRange(root, i, j);
  }

  private static class Node {
    private final int start;
    private final int end;
    private int value;
    private Node left;
    private Node right;

    Node(int start, int end) {
      this.start = start;
      this.end = end;
      value = 0;
    }
  }
}
