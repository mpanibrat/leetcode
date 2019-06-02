package com.panibrat.math._441;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
441. Arranging Coins

You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
 */
public class SolutionTest {

  @Test
  public void arrangeCoins() {
    assertEquals(2, new Solution().arrangeCoins(5));
    assertEquals(3, new Solution().arrangeCoins(8));
    assertEquals(60070, new Solution().arrangeCoins(1804289383));
  }
}
