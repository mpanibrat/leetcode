package com.panibrat.matrix._54;

import java.util.ArrayList;
import java.util.List;

/*
54. Spiral Matrix

Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix.length == 0) return result;
    for (int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1; r1 <= r2 && c1 <= c2; r1++, r2--, c1++, c2--) {
      for (int c = c1; c <= c2; c++) result.add(matrix[r1][c]);
      for (int r = r1 + 1; r <= r2; r++) result.add(matrix[r][c2]);
      if (r1 < r2 && c1 < c2) {
        for (int c = c2 - 1; c > c1; c--) result.add(matrix[r2][c]);
        for (int r = r2; r > r1; r--) result.add(matrix[r][c1]);
      }
    }
    return result;
  }
}