package com.panibrat.math._9;

/*
9. Palindrome Number

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
 */
class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) return false;
    int rev = 0;
    int max = Integer.MAX_VALUE / 10;
    for (int num = x; num != 0; num /= 10) {
      if (rev > max) return false;
      rev = rev * 10 + num % 10;
    }
    return x == rev;
  }
}