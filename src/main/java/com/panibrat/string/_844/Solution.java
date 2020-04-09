package com.panibrat.string._844;

/*
844. Backspace String Compare

Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".

Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".

Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".

Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".


Note:
1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.

Follow up:
Can you solve it in O(N) time and O(1) space?
 */
public class Solution {
  public boolean backspaceCompare(String S, String T) {
    int s = nextIndex(S, S.length() - 1);
    int t = nextIndex(T, T.length() - 1);
    while (s >= 0 && t >= 0 && S.charAt(s) == T.charAt(t)) {
      s = nextIndex(S, s - 1);
      t = nextIndex(T, t - 1);
    }
    return nextIndex(S, s) < 0 && nextIndex(T, t) < 0;
  }

  /**
   * Gets next smaller index of non-deleted character in the string with backspaces.
   *
   * @param str the string
   * @param index the current index
   * @return next smaller index of non-deleted character, or negative value
   */
  private int nextIndex(String str, int index) {
    int skip = 0;
    while (index >= 0 && (isBackspace(str, index) || skip > 0)) {
      skip += isBackspace(str, index) ? 1 : -1;
      index -= 1;
    }
    return index;
  }

  private boolean isBackspace(String str, int index) {
    return str.charAt(index) == '#';
  }
}
