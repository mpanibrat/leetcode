package com.panibrat.array._283;

/*
283. Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
class Solution {
  public void moveZeroes(int[] nums) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != 0) {
        nums[i++] = nums[j];
      }
    }
    while (i < nums.length) {
      nums[i++] = 0;
    }
  }
}