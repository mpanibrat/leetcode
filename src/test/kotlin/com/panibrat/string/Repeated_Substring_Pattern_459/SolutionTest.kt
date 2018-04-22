package com.panibrat.string.Repeated_Substring_Pattern_459

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun repeatedSubstringPatternExample1() {
        assertThat(sol.repeatedSubstringPattern("abab")).isTrue()
    }

    @Test
    fun repeatedSubstringPatternExample2() {
        assertThat(sol.repeatedSubstringPattern("aba")).isFalse()
    }

    @Test
    fun repeatedSubstringPatternExample3() {
        assertThat(sol.repeatedSubstringPattern("abcabcabcabc")).isTrue()
    }
}