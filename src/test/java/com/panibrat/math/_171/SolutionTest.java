package com.panibrat.math._171;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
171. Excel Sheet Column Number

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...

Example 1:
Input: "A"
Output: 1

Example 2:
Input: "AB"
Output: 28

Example 3:
Input: "ZY"
Output: 701
 */
public class SolutionTest {

  @Test
  public void titleToNumber_1() {
    assertEquals(1, new Solution().titleToNumber("A"));
  }

  @Test
  public void titleToNumber_2() {
    assertEquals(28, new Solution().titleToNumber("AB"));
  }

  @Test
  public void titleToNumber_3() {
    assertEquals(701, new Solution().titleToNumber("ZY"));
  }
}
