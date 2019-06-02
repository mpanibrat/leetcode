package com.panibrat.string._434;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
434. Number of Segments in a String

Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
 */
public class SolutionTest {

  @Test
  public void countSegments() {
    assertEquals(5, new Solution().countSegments("Hello, my name is John"));
  }

  @Test
  public void countSegments_1() {
    assertEquals(0, new Solution().countSegments("        "));
  }

  @Test
  public void countSegments_2() {
    assertEquals(2, new Solution().countSegments("     qwe   qwe   "));
  }

  @Test
  public void countSegments_3() {
    assertEquals(0, new Solution().countSegments(""));
  }
}
