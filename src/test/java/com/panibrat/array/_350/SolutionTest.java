package com.panibrat.array._350;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;

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
public class SolutionTest {

  @Test
  public void intersect_1() {
    int[] intersect = new Solution().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
    Arrays.sort(intersect);
    assertArrayEquals(intersect, new int[]{2, 2});
  }

  @Test
  public void intersect_2() {
    int[] intersect = new Solution().intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
    Arrays.sort(intersect);
    assertArrayEquals(intersect, new int[]{4, 9});
  }
}