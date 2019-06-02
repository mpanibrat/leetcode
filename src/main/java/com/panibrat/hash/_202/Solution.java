package com.panibrat.hash._202;

import java.util.HashSet;
import java.util.Set;

/*
202. Happy Number

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
class Solution {

  public boolean isHappyUsingHash(int n) {
    if (n < 1) {
      return false;
    }
    Set<Integer> seen = new HashSet<>();
    while (seen.add(n)) {
      n = getSquareSum(n);
    }
    return n == 1;
  }

  public boolean isHappy(int n) {
    if (n < 1) {
      return false;
    }
    int slow = getSquareSum(n);
    int fast = getSquareSum(getSquareSum(n));
    while (slow != fast) {
      slow = getSquareSum(slow);
      fast = getSquareSum(getSquareSum(fast));
    }
    return slow == 1;
  }

  private int getSquareSum(int n) {
    int sum = 0;
    for (; n > 0; n /= 10) {
      int digit = n % 10;
      sum += digit * digit;
    }
    return sum;
  }
}
