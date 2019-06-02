package com.panibrat.math._367;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
public class SolutionTest {

  @Test
  public void isPerfectSquare_1() {
    assertTrue(new Solution().isPerfectSquare(16));
  }

  @Test
  public void isPerfectSquare_2() {
    assertFalse(new Solution().isPerfectSquare(14));
  }

  @Test
  public void isPerfectSquare_3() {
    assertFalse(new Solution().isPerfectSquare(2147483647));
  }
}
