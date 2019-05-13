package com.panibrat.math._371;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
371. Sum of Two Integers

Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example 1:

Input: a = 1, b = 2
Output: 3

Example 2:

Input: a = -2, b = 3
Output: 1
 */
public class SolutionTest {

  @Test
  public void getSum_1() {
    assertEquals(5, new Solution().getSum(2, 3));
  }

  @Test
  public void getSum_2() {
    assertEquals(-3, new Solution().getSum(5, -8));
  }
}