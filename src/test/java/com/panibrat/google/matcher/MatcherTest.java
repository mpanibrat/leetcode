package com.panibrat.google.matcher;

import static org.assertj.core.api.Assertions.assertThat;

import com.panibrat.google.match.DfaMatcherImpl;
import com.panibrat.google.match.Matcher;
import org.junit.Test;

public class MatcherTest {

  @Test
  public void matchLiteral() {
    Matcher matcher = new DfaMatcherImpl();
    matcher.addFilter("test");
    assertThat(matcher.matches("test")).isTrue();
    assertThat(matcher.matches("tes")).isFalse();
    assertThat(matcher.matches("")).isFalse();
    assertThat(matcher.matches("tester")).isFalse();
    assertThat(matcher.matches("cast")).isFalse();
  }

  @Test
  public void matchPrefix() {
    Matcher matcher = new DfaMatcherImpl();
    matcher.addFilter("t*");
    assertThat(matcher.matches("test")).isTrue();
    assertThat(matcher.matches("t")).isTrue();
    assertThat(matcher.matches("")).isFalse();
    assertThat(matcher.matches("tester")).isTrue();
    assertThat(matcher.matches("cast")).isFalse();
  }

  @Test
  public void matchSuffix() {
    Matcher matcher = new DfaMatcherImpl();
    matcher.addFilter("*t");
    assertThat(matcher.matches("test")).isTrue();
    assertThat(matcher.matches("t")).isTrue();
    assertThat(matcher.matches("")).isFalse();
    assertThat(matcher.matches("tester")).isFalse();
    assertThat(matcher.matches("cast")).isTrue();
  }

  @Test
  public void match() {
    Matcher matcher = new DfaMatcherImpl();
    matcher.addFilter("t*t");
    assertThat(matcher.matches("test")).isTrue();
    assertThat(matcher.matches("t")).isFalse();
    assertThat(matcher.matches("")).isFalse();
    assertThat(matcher.matches("tt")).isTrue();
    assertThat(matcher.matches("temp")).isFalse();
    assertThat(matcher.matches("cast")).isFalse();
  }

  @Test
  public void matchAny() {
    Matcher matcher = new DfaMatcherImpl();
    matcher.addFilter("*");
    assertThat(matcher.matches("test")).isTrue();
    assertThat(matcher.matches("t")).isTrue();
    assertThat(matcher.matches("")).isTrue();
    assertThat(matcher.matches("tt")).isTrue();
    assertThat(matcher.matches("temp")).isTrue();
    assertThat(matcher.matches("cast")).isTrue();
  }

  @Test
  public void matchPatterns() {
    Matcher matcher = new DfaMatcherImpl();
    matcher.addFilter("maks*@google");
    matcher.addFilter("*doe@google");
    matcher.addFilter("john.doe@*");
    assertThat(matcher.matches("maksym@google")).isTrue();
    assertThat(matcher.matches("john@google")).isFalse();
    assertThat(matcher.matches("mike.doe@google")).isTrue();
    assertThat(matcher.matches("john.doe@apple")).isTrue();
    assertThat(matcher.matches("sergei@google")).isFalse();
  }

  @Test
  public void matchMultiWildcardPatterns() {
    Matcher matcher = new DfaMatcherImpl();
    matcher.addFilter("maks*@g*gle");
    matcher.addFilter("*doe@google");
    matcher.addFilter("john.doe@*");
    matcher.addFilter("***a");
    assertThat(matcher.matches("a")).isTrue();
    assertThat(matcher.matches("aaaaa")).isTrue();
    assertThat(matcher.matches("tst")).isFalse();
    assertThat(matcher.matches("maksym@google")).isTrue();
    assertThat(matcher.matches("maksym@gigle")).isTrue();
    assertThat(matcher.matches("john@google")).isFalse();
    assertThat(matcher.matches("mike.doe@google")).isTrue();
    assertThat(matcher.matches("john.doe@apple")).isTrue();
    assertThat(matcher.matches("sergei@google")).isFalse();
  }
}
