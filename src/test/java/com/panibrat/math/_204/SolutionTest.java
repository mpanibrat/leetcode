package com.panibrat.math._204;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
204. Count Primes

Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class SolutionTest {

  @Test
  public void countPrimes_10() {
    assertEquals(4, new Solution().countPrimes(10));
  }

  @Test
  public void countPrimes_2() {
    assertEquals(0, new Solution().countPrimes(2));
  }

  @Test
  public void countPrimes_1() {
    assertEquals(0, new Solution().countPrimes(1));
  }

  @Test
  public void countPrimes_3() {
    assertEquals(1, new Solution().countPrimes(3));
  }
}
