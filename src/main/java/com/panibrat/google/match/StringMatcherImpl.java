package com.panibrat.google.match;

import java.util.HashSet;
import java.util.Set;

public class StringMatcherImpl implements Matcher {

  Set<String> patterns = new HashSet<>();

  @Override
  public void addFilter(String filter) {
    patterns.add(filter);
  }

  @Override
  public boolean matches(String word) {
    for (String pattern : patterns) {
      if (match(pattern, word)) {
        return true;
      }
    }
    return false;
  }

  private boolean match(String pattern, String word) {
    int k = pattern.indexOf(WILDCARD);
    if (k < 0) {
      return pattern.equals(word);
    }
    if (word.length() < k || word.length() < pattern.length() - 1) {
      return false;
    }
    for (int i = 0; i < k; i++) {
      if (pattern.charAt(i) != word.charAt(i)) {
        return false;
      }
    }
    for (int i = pattern.length() - 1, j = word.length() - 1; i > k; i--, j--) {
      if (pattern.charAt(i) != word.charAt(j)) {
        return false;
      }
    }
    return true;
  }
}
