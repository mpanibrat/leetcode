package com.panibrat.array._119;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
119. Pascal's Triangle II

Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 3
Output: [1,3,3,1]
Follow up:

Could you optimize your algorithm to use only O(k) extra space?
 */
class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = Collections.emptyList();
    for (int i = 0; i <= rowIndex; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == i || j == 0) {
          row.add(1);
        } else {
          row.add(result.get(j - 1) + result.get(j));
        }
      }
      result = row;
    }
    return result;
  }
}