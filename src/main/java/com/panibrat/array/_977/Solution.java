package com.panibrat.array._977;

/*
977. Squares of a Sorted Array

Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Example 2:
Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Note:
* 1 <= A.length <= 10000
* -10000 <= A[i] <= 10000
* A is sorted in non-decreasing order.

 */
class Solution {
  public int[] sortedSquares(int[] array) {
    int[] result = new int[array.length];
    int left = 0;
    int right = array.length - 1;
    for (int i = array.length - 1; i >= 0; i--) {
      if (Math.abs(array[left]) > Math.abs(array[right])) {
        result[i] = array[left] * array[left];
        left += 1;
      } else {
        result[i] = array[right] * array[right];
        right -= 1;
      }
    }
    return result;
  }
}
