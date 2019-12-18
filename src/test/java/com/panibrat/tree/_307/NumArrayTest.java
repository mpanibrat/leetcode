package com.panibrat.tree._307;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

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
public class NumArrayTest {

  @Test
  public void testFenwick() {
    int[] nums = {1, 3, 5};
    FenwickTreeNumArrayImpl numArray = new FenwickTreeNumArrayImpl(nums);
    assertThat(numArray.sumRange(0, 2)).isEqualTo(9);
    numArray.update(1, 2);
    assertThat(numArray.sumRange(0, 2)).isEqualTo(8);
  }

  @Test
  public void testSegment() {
    int[] nums = {1, 3, 5};
    NumArray numArray = new SegmentTreeNumArrayImpl(nums);
    assertThat(numArray.sumRange(0, 2)).isEqualTo(9);
    numArray.update(1, 2);
    assertThat(numArray.sumRange(0, 2)).isEqualTo(8);
  }
}
