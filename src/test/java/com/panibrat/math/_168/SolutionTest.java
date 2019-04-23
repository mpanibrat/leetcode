package com.panibrat.math._168;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
168. Excel Sheet Column Title

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    ...

Example 1:
Input: 1
Output: "A"

Example 2:
Input: 28
Output: "AB"

Example 3:
Input: 701
Output: "ZY"
 */
public class SolutionTest {

  @Test
  public void convertToTitle_1() {
    assertEquals("A", new Solution().convertToTitle(1));
  }

  @Test
  public void convertToTitle_2() {
    assertEquals("AB", new Solution().convertToTitle(28));
  }

  @Test
  public void convertToTitle_3() {
    assertEquals("ZY", new Solution().convertToTitle(701));
  }
}