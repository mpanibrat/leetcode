package com.panibrat.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MinLenAfterKCharsRemovedTest {

  @Test
  public void solution() {
    MinLenAfterKCharsRemoved task =
        new MinLenAfterKCharsRemoved();
    assertThat(task.solution("ABBBCCDDCCC", 3)).isEqualTo(5);
    assertThat(task.solution("AAAAAAAAAAABXXAAAAAAAAAA", 3)).isEqualTo(3);
    assertThat(task.solution("ABCDDDEFG", 2)).isEqualTo(6);
    assertThat(task.solution("ABBBCCDDCCC", 0)).isEqualTo(9);
    assertThat(task.solution("ABC", 3)).isEqualTo(0);
  }
}
