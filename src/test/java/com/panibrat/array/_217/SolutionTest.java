package com.panibrat.array._217;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
217. Contains Duplicate

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true

Example 2:

Input: [1,2,3,4]
Output: false

Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class SolutionTest {

  @Test
  public void containsDuplicate_1() {
    assertTrue(new Solution().containsDuplicate(new int[]{1, 2, 3, 1}));
  }

  @Test
  public void containsDuplicate_2() {
    assertFalse(new Solution().containsDuplicate(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void containsDuplicate_3() {
    assertTrue(new Solution().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
  }
}