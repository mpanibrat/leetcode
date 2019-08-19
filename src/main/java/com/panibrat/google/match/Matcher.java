package com.panibrat.google.match;

/**
 * Design class that verifies if word matches supplied filters.
 *
 * <p>Filter looks like "hel*o", "*" matches any character and any number of characters.
 *
 * <p>Each filter always contains only one "*".
 */
public interface Matcher {

  char WILDCARD = '*';

  void addFilter(String filter);

  boolean matches(String word);
}
