package com.panibrat.math._507;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
public class SolutionTest {

  @Test
  public void checkPerfectNumber() {
    Solution solution = new Solution();
    assertTrue(solution.checkPerfectNumber(6));
    assertTrue(solution.checkPerfectNumber(28));
    assertTrue(solution.checkPerfectNumber(496));
    assertTrue(solution.checkPerfectNumber(33550336));
    assertFalse(solution.checkPerfectNumber(42));
    assertFalse(solution.checkPerfectNumber(100_000_000));
  }
}
