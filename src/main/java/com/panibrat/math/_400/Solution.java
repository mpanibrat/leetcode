package com.panibrat.math._400;

/*
400. Nth Digit

Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

Note:
n is positive and will fit within the range of a 32-bit signed integer (n < 231).

Example 1:

Input: 3
Output: 3

Example 2:

Input: 11
Output: 0

Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
 */
class Solution {
  public int findNthDigit_bruteForce(int n) {
    StringBuilder builder = new StringBuilder();
    int number = 0;
    while (builder.length() <= n) {
      builder.append(number++);
    }
    return builder.charAt(n) - '0';
  }

  public int findNthDigit(int n) {
    n -= 1; // ignores zero

    int digits = 1;
    long range = 9;
    int number = 1;

    while (n > digits * range) {
      n -= digits * range;
      digits += 1;
      range *= 10;
      number *= 10;
    }
    number += n / digits;

    return Integer.toString(number).charAt(n % digits) - '0';
  }
}
