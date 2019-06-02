package com.panibrat.string._125;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
public class SolutionTest {

  @Test
  public void isPalindrome0() {
    assertTrue(new Solution().isPalindrome(null));
  }

  @Test
  public void isPalindrome1() {
    assertTrue(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
  }

  @Test
  public void isPalindrome2() {
    assertFalse(new Solution().isPalindrome("race a car"));
  }
}
