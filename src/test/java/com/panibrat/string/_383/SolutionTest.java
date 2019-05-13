package com.panibrat.string._383;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
383. Ransom Note

Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */
public class SolutionTest {

  @Test
  public void canConstruct_1() {
    assertFalse(new Solution().canConstruct("a", "b"));
  }

  @Test
  public void canConstruct_2() {
    assertFalse(new Solution().canConstruct("aa", "bb"));
  }

  @Test
  public void canConstruct_3() {
    assertTrue(new Solution().canConstruct("aa", "aab"));
  }
}