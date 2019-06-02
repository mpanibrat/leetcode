package com.panibrat.array._350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
350. Intersection of Two Arrays II

Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]

Note:

* Each element in the result should appear as many times as it shows in both arrays.
* The result can be in any order.

Follow up:

* What if the given array is already sorted? How would you optimize your algorithm?
* What if nums1's size is small compared to nums2's size? Which algorithm is better?
* What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
class Solution {

  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();

    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int i = 0;
    int j = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        list.add(nums1[i]);
        i++;
        j++;
      }
    }

    int[] array = new int[list.size()];
    for (int k = 0; k < array.length; k++) {
      array[k] = list.get(k);
    }
    return array;
  }

  public int[] intersectHash(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int v : nums1) {
      map.merge(v, 1, Integer::sum);
    }
    for (int v : nums2) {
      if (map.merge(v, -1, Integer::sum) >= 0) {
        list.add(v);
      }
    }
    int[] array = new int[list.size()];
    for (int i = 0; i < array.length; i++) {
      array[i] = list.get(i);
    }
    return array;
  }
}
