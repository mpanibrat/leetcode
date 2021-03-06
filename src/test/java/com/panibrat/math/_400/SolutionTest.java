package com.panibrat.math._400;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
400. Nth Digit

Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

Note:
n is positive and will fit within the range of a 32-bit signed integer (n < 231).

Example 1:

Input: 3
Output: 3

Example 2:

Input: 11
Output: 0

Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
 */
public class SolutionTest {

  @Test
  public void findNthDigit() {
    assertEquals(3, new Solution().findNthDigit(3));
    assertEquals(0, new Solution().findNthDigit(11));
    assertEquals(6, new Solution().findNthDigit(420));
  }
}
