package com.panibrat.stack._402;

/*
402. Remove K Digits

Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

Note:
The length of num is less than 10002 and will be ≥ k.
The given num does not contain any leading zero.
Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */
class Solution {
  public String removeKdigits(String num, int k) {
    if (k >= num.length()) {
      return "0";
    }
    StringBuilder sb = new StringBuilder();
    for (char c : num.toCharArray()) {
      while (sb.length() > 0 && last(sb) > c && k-- > 0) {
        removeLast(sb);
      }
      addLast(sb, c);
    }
    while (sb.length() > 1 && first(sb) == '0') {
      removeFirst(sb);
    }
    while (k-- > 0) {
      removeLast(sb);
    }
    return sb.toString();
  }

  private static void addLast(StringBuilder builder, char c) {
    builder.append(c);
  }

  private static char last(StringBuilder builder) {
    return builder.charAt(builder.length() - 1);
  }

  private static char first(StringBuilder builder) {
    return builder.charAt(0);
  }

  private static void removeLast(StringBuilder builder) {
    builder.deleteCharAt(builder.length() - 1);
  }

  private static void removeFirst(StringBuilder builder) {
    builder.deleteCharAt(0);
  }
}
