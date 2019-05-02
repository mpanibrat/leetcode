package com.panibrat.hash._219;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
219. Contains Duplicate II

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
public class SolutionTest {

  @Test
  public void containsNearbyDuplicate_1() {
    assertTrue(new Solution().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
  }

  @Test
  public void containsNearbyDuplicate_2() {
    assertTrue(new Solution().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
  }

  @Test
  public void containsNearbyDuplicate_3() {
    assertFalse(new Solution().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
  }
}