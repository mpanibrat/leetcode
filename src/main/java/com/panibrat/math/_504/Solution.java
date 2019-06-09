package com.panibrat.math._504;

/*
504. Base 7

Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"

Example 2:
Input: -7
Output: "-10"

Note: The input will be in range of [-1e7, 1e7].
 */
class Solution {

  public String convertToBase7(int num) {
    return convertToBase(num, 7);
  }

  private static String convertToBase(int num, int base) {
    if (num == 0) {
      return "0";
    }

    boolean negative = false;
    if (num < 0) {
      negative = true;
      num = -num;
    }

    StringBuilder builder = new StringBuilder();
    while (num != 0) {
      builder.append(num % base);
      num /= base;
    }
    if (negative) {
      builder.append('-');
    }

    return builder.reverse().toString();
  }
}
