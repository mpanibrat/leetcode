package com.panibrat.google.match;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DfaMatcherImpl implements Matcher {

  State initial = new State();

  @Override
  public void addFilter(String filter) {
    State state = initial;
    for (char c : filter.toCharArray()) {
      if (!state.transition.containsKey(c)) {
        state.transition.put(c, c == WILDCARD ? state : new State());
      }
      state = state.transition.get(c);
    }
    state.filters.add(filter);
  }

  @Override
  public boolean matches(String word) {
    State state = initial;
    State fallback = null;
    for (char c : word.toCharArray()) {
      if (state.transition.containsKey(WILDCARD)) {
        fallback = state;
      }
      state = state.transition.getOrDefault(c, fallback);
      if (state == null) {
        return false;
      }
    }
    return !state.filters.isEmpty();
  }

  private static class State {
    Map<Character, State> transition = new HashMap<>();
    Set<String> filters = new HashSet<>();
  }
}
