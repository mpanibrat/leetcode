package com.panibrat.math._204;

import java.util.Arrays;

/*
204. Count Primes

Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
class Solution {

  public int countPrimes(int n) {
    boolean[] primes = new boolean[n];
    Arrays.fill(primes, true);

    int count = 0;
    for (int i = 2; i < n; i++) {
      if (primes[i]) {
        count += 1;
        for (int j = i; j < n; j += i) {
          primes[j] = false;
        }
      }

    }
    return count;
  }
}
