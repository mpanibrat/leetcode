package com.panibrat.array._169;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
169. Majority Element

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3

Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */
public class SolutionTest {

  @Test
  public void majorityElement_1() {
    int[] array = new int[]{3, 2, 3};
    assertEquals(3, new Solution().majorityElement(array));
  }

  @Test
  public void majorityElement_2() {
    int[] array = new int[]{2, 2, 1, 1, 1, 2, 2};
    assertEquals(2, new Solution().majorityElement(array));
  }
}