package com.panibrat.array._88;

import java.util.Arrays;

/*
88. Merge Sorted Array

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0,0], m = 3
nums2 = [2,2,5,6],       n = 4

Output: [1,2,2,2,3,5,6]
 */
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] tmp = Arrays.copyOf(nums1, m);
    int size = m + n;
    int i = 0;
    int j = 0;
    int k = 0;
    while (k < size && i < m && j < n) {
      if (tmp[i] < nums2[j]) {
        nums1[k++] = tmp[i++];
      } else {
        nums1[k++] = nums2[j++];
      }
    }
    while (i < m && k < size) {
      nums1[k++] = tmp[i++];
    }
    while (j < n && k < size) {
      nums1[k++] = nums2[j++];
    }
  }
}