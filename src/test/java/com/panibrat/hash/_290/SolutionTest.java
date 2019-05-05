package com.panibrat.hash._290;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
290. Word Pattern

Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false

Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
 */
public class SolutionTest {

  @Test
  public void wordPattern_1() {
    assertTrue(new Solution().wordPattern("abba", "dog cat cat dog"));
  }

  @Test
  public void wordPattern_2() {
    assertFalse(new Solution().wordPattern("abba", "dog cat cat fish"));
  }

  @Test
  public void wordPattern_3() {
    assertFalse(new Solution().wordPattern("aaaa", "dog cat cat dog"));
  }

  @Test
  public void wordPattern_4() {
    assertFalse(new Solution().wordPattern("abba", "dog dog dog dog"));
  }
}