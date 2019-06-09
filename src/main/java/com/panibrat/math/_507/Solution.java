package com.panibrat.math._507;

/*
507. Perfect Number

We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.

Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.

Example:
Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14

Note: The input number n will not exceed 100,000,000. (1e8)
 */
class Solution {
  public boolean checkPerfectNumber(int n) {
    if (n <= 1) {
      return false;
    }
    return sumDivisorsOf(n) == n;
  }

  private static int sumDivisorsOf(int n) {
    int sum = 1;
    for (int i = 2, j = (int) Math.sqrt(n); i <= j; i++) {
      if (n % i == 0) {
        sum += i + n / i;
      }
    }
    return sum;
  }
}
