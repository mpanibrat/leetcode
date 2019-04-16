package com.panibrat.string._38;

import java.util.HashMap;
import java.util.Map;

/*
38. Count and Say

The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
6.     312211

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.



Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"

 */
class Solution {
  private static final Map<Integer, String> CACHE = new HashMap<>();

  static {
    CACHE.put(1, "1");
    CACHE.put(2, "11");
    CACHE.put(3, "21");
    CACHE.put(4, "1211");
    CACHE.put(5, "111221");
  }

  public String countAndSay(int n) {
    if (CACHE.containsKey(n)) {
      return CACHE.get(n);
    }
    String str = countAndSay(n - 1);
    StringBuilder builder = new StringBuilder();
    int count = 1;
    char prev = str.charAt(0);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) != prev) {
        builder.append(count).append(prev);
        prev = str.charAt(i);
        count = 1;
      } else {
        count += 1;
      }
    }
    builder.append(count).append(prev);
    CACHE.put(n, builder.toString());
    return CACHE.get(n);
  }
}
