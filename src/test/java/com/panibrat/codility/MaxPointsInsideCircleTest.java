package com.panibrat.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MaxPointsInsideCircleTest {

  @Test
  public void solution() {
    MaxPointsInsideCircle task = new MaxPointsInsideCircle();
    assertThat(task.solution("ABDCA", new int[] {2, -1, -4, -3, 3}, new int[] {2, -2, 4, 1, -3}))
        .isEqualTo(3);
    assertThat(task.solution("ABB", new int[] {1, -2, -2}, new int[] {1, -2, 2})).isEqualTo(1);
    assertThat(task.solution("CCD", new int[] {1, -1, 2}, new int[] {1, -1, -2})).isEqualTo(0);
  }
}
