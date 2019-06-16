package com.panibrat.string._557;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/*
557. Reverse Words in a String III

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class SolutionTest {

  @Test
  public void reverseWords() {
    assertThat(new Solution().reverseWords("Let's take LeetCode contest"))
        .isEqualTo("s'teL ekat edoCteeL tsetnoc");
  }
}
