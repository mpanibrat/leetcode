package com.panibrat.math._367;

/*
367. Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true

Example 2:

Input: 14
Output: false
 */
class Solution {

  public boolean isPerfectSquare(int number) {
    long min = 1;
    long max = number;
    while (min < max) {
      long mean = min + (max - min) / 2;
      if (mean * mean < number) {
        min = mean + 1;
      } else {
        max = mean;
      }
    }
    return min * min == number;
  }
}
