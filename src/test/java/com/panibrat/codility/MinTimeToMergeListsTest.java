package com.panibrat.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MinTimeToMergeListsTest {

  @Test
  public void solution() {
    MinTimeToMergeLists task = new MinTimeToMergeLists();
    assertThat(task.solution(new int[] {100, 250, 1000})).isEqualTo(1700);
    assertThat(task.solution(new int[] {1000, 250, 100, 50})).isEqualTo(1950);
    assertThat(task.solution(new int[] {1000})).isEqualTo(0);
  }
}
