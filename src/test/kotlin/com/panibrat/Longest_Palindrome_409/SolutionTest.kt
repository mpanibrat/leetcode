package com.panibrat.Longest_Palindrome_409

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun longestPalindrome() {
        val str = "abccccdd"
        assertThat(s.longestPalindrome(str)).isEqualTo(7)
    }
}