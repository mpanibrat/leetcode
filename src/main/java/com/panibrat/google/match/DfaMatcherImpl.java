package com.panibrat.google.match;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DfaMatcherImpl implements Matcher {

  State root = new State();

  @Override
  public void addFilter(String filter) {
    State state = root;
    for (char c : filter.toCharArray()) {
      if (c == WILDCARD) {
        state.addTransition(c, state);
      } else {
        state = state.getOrAddTransition(c);
      }
    }
    state.filters.add(filter);
  }

  @Override
  public boolean matches(String word) {
    State fallback = State.FAIL;
    State state = root;
    for (char c : word.toCharArray()) {
      if (state.hasTransition(WILDCARD)) {
        fallback = state;
      }
      state = state.transitOrFallback(c, fallback);
    }
    return state.isFinal();
  }

  private static class State {
    static final State FAIL = new State();

    Map<Character, State> transition = new HashMap<>();
    Set<String> filters = new HashSet<>();

    void addTransition(char c, State state) {
      transition.put(c, state);
    }

    boolean hasTransition(char c) {
      return transition.containsKey(c);
    }

    State transitOrFallback(char c, State fallback) {
      return transition.getOrDefault(c, fallback);
    }

    boolean isFinal() {
      return !filters.isEmpty();
    }

    State getOrAddTransition(char c) {
      return transition.computeIfAbsent(c, k -> new State());
    }
  }
}
