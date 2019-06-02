package com.panibrat.array._217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
class Solution {

  public boolean containsDuplicateExtraMemory(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int n : nums) {
      if (!seen.add(n)) {
        return true;
      }
    }
    return false;
  }

  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);

    for (int i = nums.length - 1; i > 0; i--) {
      if (nums[i] == nums[i - 1]) {
        return true;
      }
    }
    return false;
  }
}
