package com.panibrat.array._414;

import java.util.HashSet;
import java.util.Set;

/*
414. Third Maximum Number

Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]
Output: 1
Explanation: The third maximum is 1.

Example 2:
Input: [1, 2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: [2, 2, 3, 1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

 */
class Solution {

  public int thirdMax(int[] nums) {
    Integer first = Integer.MIN_VALUE;
    Integer second = Integer.MIN_VALUE;
    Integer third = Integer.MIN_VALUE;
    Set<Integer> set = new HashSet<>();

    for (int n : nums) {
      if (set.add(n)) {
        if (n > first) {
          third = second;
          second = first;
          first = n;
        } else if (n > second) {
          third = second;
          second = n;
        } else if (n > third) {
          third = n;
        }
      }
    }
    return set.size() >= 3 ? third : first;
  }
}
