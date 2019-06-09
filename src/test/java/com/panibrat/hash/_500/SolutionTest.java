package com.panibrat.hash._500;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
500. Keyboard Row

Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

Example:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]


Note:

You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.

 */
public class SolutionTest {

  @Test
  public void findWords() {
    assertArrayEquals(
        new String[] {"Alaska", "Dad"},
        new Solution().findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"}));
  }
}
