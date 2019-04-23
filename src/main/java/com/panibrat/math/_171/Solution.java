package com.panibrat.math._171;

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
class Solution {

  private static final int BASE = 26;

  public int titleToNumber(String s) {
    int result = 0;
    for (char c : s.toCharArray()) {
      result = result * BASE + c - 'A' + 1;
    }
    return result;
  }
}
