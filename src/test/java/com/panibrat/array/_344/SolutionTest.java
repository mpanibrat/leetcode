package com.panibrat.array._344;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.



Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class SolutionTest {

  @Test
  public void reverseString_1() {
    char[] array = "hello".toCharArray();
    new Solution().reverseString(array);
    assertArrayEquals("olleh".toCharArray(), array);
  }

  @Test
  public void reverseString_2() {
    char[] array = "Hannah".toCharArray();
    new Solution().reverseString(array);
    assertArrayEquals("hannaH".toCharArray(), array);
  }
}