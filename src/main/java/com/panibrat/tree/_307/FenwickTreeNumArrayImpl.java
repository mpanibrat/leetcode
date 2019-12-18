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
class FenwickTreeNumArrayImpl implements NumArray {

  int[] nums;
  int[] tree;

  public FenwickTreeNumArrayImpl(int[] nums) {
    this.nums = nums;
    tree = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      add(i, nums[i]);
    }
  }

  @Override
  public void update(int i, int val) {
    add(i, val - nums[i]);
    nums[i] = val;
  }

  @Override
  public int sumRange(int i, int j) {
    return get(j) - get(i - 1);
  }

  /**
   * Gets sum of all elements up to provided index.
   *
   * @param i the index
   * @return the sum of all previous elements
   */
  private int get(int i) {
    int sum = 0;
    i += 1;
    while (i > 0) {
      sum += tree[i];
      i -= i & -i;
    }
    return sum;
  }

  /**
   * Updates element at specified index by adding the provided value.
   *
   * @param i the index of element
   * @param val the value to add, might be negative
   */
  private void add(int i, int val) {
    i += 1;
    while (i < tree.length) {
      tree[i] += val;
      i += i & -i;
    }
  }
}
