package com.panibrat.string.Reverse_Vowels_of_a_String_345

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun reverseVowelsExample1() {
        assertThat(sol.reverseVowels("hello")).isEqualTo("holle")
    }

    @Test
    fun reverseVowelsExample2() {
        assertThat(sol.reverseVowels("leetcode")).isEqualTo("leotcede")
    }
}