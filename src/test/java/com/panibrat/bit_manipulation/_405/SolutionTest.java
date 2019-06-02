package com.panibrat.bit_manipulation._405;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
405. Convert a Number to Hexadecimal

Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

Note:

All letters in hexadecimal (a-f) must be in lowercase.
The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
The given number is guaranteed to fit within the range of a 32-bit signed integer.
You must not use any method provided by the library which converts/formats the number to hex directly.

Example 1:

Input:
26

Output:
"1a"

Example 2:

Input:
-1

Output:
"ffffffff"
 */
public class SolutionTest {

  @Test
  public void toHex_1() {
    assertEquals("1a", new Solution().toHex(26));
  }

  @Test
  public void toHex_2() {
    assertEquals("ffffffff", new Solution().toHex(-1));
  }
}
