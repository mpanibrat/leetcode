package com.panibrat.array._414;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
414. Third Maximum Number

Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]
Output: 1
Explanation: The third maximum is 1.

Example 2:
Input: [1, 2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: [2, 2, 3, 1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

 */
public class SolutionTest {

  @Test
  public void thirdMax_1() {
    assertEquals(1, new Solution().thirdMax(new int[] {3, 2, 1}));
  }

  @Test
  public void thirdMax_2() {
    assertEquals(2, new Solution().thirdMax(new int[] {1, 2}));
  }

  @Test
  public void thirdMax_3() {
    assertEquals(1, new Solution().thirdMax(new int[] {2, 2, 3, 1}));
  }
}
