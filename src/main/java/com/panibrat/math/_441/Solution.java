package com.panibrat.math._441;

/*
441. Arranging Coins

You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
 */
class Solution {

  public int naiveArrangeCoins(int n) {
    int row = 0;
    while (n > row) {
      row += 1;
      n -= row;
    }
    return row;
  }

  // n = 1 + 2 + 3 + ... + k + c, where c is [0..k]
  // n = k * (k + 1) / 2 + c
  // k?
  public int arrangeCoins(int n) {
    int low = 0;
    int high = n;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      long sum = (long) mid * (mid + 1) / 2;
      if (sum > n) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return high;
  }
}