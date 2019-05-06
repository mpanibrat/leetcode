package com.panibrat.dp._303;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
303. Range Sum Query - Immutable

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3

Note:
* You may assume that the array does not change.
* There are many calls to sumRange function.

 */
public class NumArrayTest {

  @Test
  public void sumRange() {
    NumArray array = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
    assertEquals(1, array.sumRange(0, 2));
    assertEquals(-1, array.sumRange(2, 5));
    assertEquals(-3, array.sumRange(0, 5));
  }
}