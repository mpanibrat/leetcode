package com.panibrat.string._5;

/*
5. Longest Palindromic Substring

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */


class Solution {
  public String longestPalindrome(String s) {
    if (s == null || s.length() < 2) return s;
    int start = 0;
    int longest = 0;
    for (int i = 0; i < s.length(); i++) {
      int len = Math.max(expand(s, i, i), expand(s, i, i + 1));
      if (len > longest) {
        longest = len;
        start = i - (len - 1) / 2;
      }
    }
    return s.substring(start, start + longest);
  }

  private int expand(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left -= 1;
      right += 1;
    }
    return right - left - 1;
  }
}