package com.panibrat.array._118;

import java.util.ArrayList;
import java.util.List;

/*
118. Pascal's Triangle

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
class Solution {
  public List<List<Integer>> generate(int n) {
    List<List<Integer>> triangle = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == i || j == 0) {
          row.add(1);
        } else {
          row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
        }
      }
      triangle.add(row);
    }
    return triangle;
  }
}
