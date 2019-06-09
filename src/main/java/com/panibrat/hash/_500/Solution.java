package com.panibrat.hash._500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
class Solution {

  private static Set<Character> row1 =
      new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
  private static Set<Character> row2 =
      new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
  private static Set<Character> row3 =
      new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

  public String[] findWords(String[] words) {
    List<String> found = new ArrayList<>();
    for (String word : words) {
      if (typedUsingSingleRow(word.toLowerCase())) {
        found.add(word);
      }
    }
    return found.toArray(new String[0]);
  }

  private boolean typedUsingSingleRow(String s) {
    return allLettersInRow(s, row2) || allLettersInRow(s, row1) || allLettersInRow(s, row3);
  }

  private boolean allLettersInRow(String s, Set<Character> row) {
    for (char c : s.toCharArray()) {
      if (!row.contains(c)) {
        return false;
      }
    }
    return true;
  }
}
