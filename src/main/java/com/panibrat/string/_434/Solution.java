package com.panibrat.string._434;

/*
434. Number of Segments in a String

Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
 */
class Solution {

  private static final char SPACE = ' ';

  public int countSegments(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    int count = s.charAt(0) != SPACE ? 1 : 0;
    for (int i = s.length() - 1; i > 0; i--) {
      if (s.charAt(i) != SPACE && s.charAt(i - 1) == SPACE) {
        count += 1;
      }
    }
    return count;
  }
}