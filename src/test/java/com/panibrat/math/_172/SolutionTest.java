package com.panibrat.math._172;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
172. Factorial Trailing Zeroes

Given an integer n, return the number of trailing zeroes in n!.

Example 1:
Input: 3
Output: 0
Explanation: 3! = 6, no trailing zero.

Example 2:
Input: 5
Output: 1
Explanation: 5! = 120, one trailing zero.

Note: Your solution should be in logarithmic time complexity.
 */
public class SolutionTest {

  @Test
  public void trailingZeroes_1() {
    assertEquals(0, new Solution().trailingZeroes(3));
  }

  @Test
  public void trailingZeroes_2() {
    assertEquals(1, new Solution().trailingZeroes(5));
  }
}
