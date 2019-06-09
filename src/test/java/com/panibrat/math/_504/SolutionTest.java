package com.panibrat.math._504;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
public class SolutionTest {

  @Test
  public void convertToBase7() {
    assertEquals("202", new Solution().convertToBase7(100));
    assertEquals("-10", new Solution().convertToBase7(-7));
    assertEquals("0", new Solution().convertToBase7(0));
  }
}
