package com.panibrat.google.range;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FenwickTreeLightBulbImplTest {

  @Test
  public void test() {
    FenwickTreeLightBulbImpl bulbs = new FenwickTreeLightBulbImpl(1000);
    bulbs.toggle(50, 120);
    bulbs.toggle(75, 150);
    bulbs.toggle(100, 200);

    assertThat(bulbs.isOn(100)).isTrue();
    assertThat(bulbs.isOn(50)).isTrue();
    assertThat(bulbs.isOn(0)).isFalse();
    assertThat(bulbs.isOn(90)).isFalse();
    assertThat(bulbs.isOn(130)).isFalse();
    assertThat(bulbs.isOn(110)).isTrue();
    assertThat(bulbs.isOn(111)).isTrue();
    assertThat(bulbs.isOn(77)).isFalse();
  }
}
