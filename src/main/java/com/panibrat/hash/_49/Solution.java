package com.panibrat.hash._49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
49. Group Anagrams

Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */
public class Solution {
  private static final List<Integer> PRIMES = getFirstNPrimes(26);

  public List<List<String>> groupAnagrams(String[] strings) {
    Map<Integer, List<String>> map = new HashMap<>();
    for (String str : strings) {
      int key = getKey(str);
      map.putIfAbsent(key, new ArrayList<>());
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
  }

  private int getKey(String str) {
    int key = 1;
    for (char c : str.toCharArray()) {
      key *= PRIMES.get(c - 'a');
    }
    return key;
  }

  private static List<Integer> getFirstNPrimes(int n) {
    List<Integer> primes = new ArrayList<>();
    primes.add(2);
    int k = 1;
    for (int i = 1; i < n; i++) {
      k += 2;
      while (!isPrime(k)) {
        k += 2;
      }
      primes.add(k);
    }
    return primes;
  }

  private static boolean isPrime(int n) {
    if (n % 2 == 0) {
      return n == 2;
    }
    for (int i = 3, j = sqrt(n); i <= j; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static int sqrt(int n) {
    int low = 0;
    int high = n;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (mid == n / mid) {
        return mid;
      }
      if (mid < n / mid) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return low - 1;
  }
}
