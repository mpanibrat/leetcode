package com.panibrat.string._125;

/*
125. Valid Palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */
class Solution {

  private static boolean equalIgnoreCase(char a, char b) {
    return Character.toUpperCase(a) == Character.toUpperCase(b);
  }

  public boolean isPalindrome(String s) {
    if (s == null || s.isEmpty()) {
      return true;
    }
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (!Character.isLetterOrDigit(s.charAt(left))) {
        left += 1;
      } else if (!Character.isLetterOrDigit(s.charAt(right))) {
        right -= 1;
      } else if (!equalIgnoreCase(s.charAt(left), s.charAt(right))) {
        return false;
      } else {
        left += 1;
        right -= 1;
      }
    }
    return true;
  }
}
