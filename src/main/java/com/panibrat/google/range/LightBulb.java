package com.panibrat.google.range;

/**
 * Design class LightBulbs that allows to track which bulbs are lighten.
 *
 * <p>Restriction: {@link #toggle} is used infrequently, but it needs to be better than O(n)
 */
public interface LightBulb {
  boolean isOn(int index);

  void toggle(int start, int end);
}
