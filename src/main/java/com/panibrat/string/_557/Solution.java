package com.panibrat.string._557;

/*
557. Reverse Words in a String III

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
class Solution {
  public String reverseWords(String s) {
    char[] array = s.toCharArray();
    int wordStart = 0;
    int wordEnd = 0;
    while (wordEnd < array.length) {
      if (wordStart >= wordEnd || array[wordEnd] != ' ') {
        wordEnd++;
      } else {
        reverse(array, wordStart, wordEnd - 1);
        wordStart = wordEnd + 1;
      }
    }
    reverse(array, wordStart, array.length - 1);
    return String.valueOf(array);
  }

  private static void reverse(char[] array, int fromIndex, int toIndex) {
    for (int i = fromIndex, j = toIndex; i < j; i++, j--) {
      char temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }
}
