package com.panibrat.string._14;

/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
 */

class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    int minLength = Integer.MAX_VALUE;
    for (String s : strs) {
      minLength = Math.min(minLength, s.length());
    }
    int lo = 0;
    int hi = minLength;
    int mid = (lo + hi) / 2;
    while (lo <= hi) {
      if (commonPrefix(strs, mid)) lo = mid + 1;
      else hi = mid - 1;
      mid = (lo + hi) / 2;
    }
    return strs[0].substring(0, mid);
  }

  private boolean commonPrefix(String[] strs, int len) {
    String prefix = strs[0].substring(0, len);
    for (int i = 1; i < strs.length; i++) {
      if (!strs[i].startsWith(prefix)) return false;
    }
    return true;
  }
}
