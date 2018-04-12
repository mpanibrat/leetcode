package com.panibrat.Palindrome_Permutation_266

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun canPermutePalindromeExample1() {
        val solution = Solution()
        val s = "code"
        assertThat(solution.canPermutePalindrome(s)).isEqualTo(false)
    }

    @Test
    fun canPermutePalindromeExample2() {
        val solution = Solution()
        val s = "aab"
        assertThat(solution.canPermutePalindrome(s)).isEqualTo(true)
    }

    @Test
    fun canPermutePalindromeExample3() {
        val solution = Solution()
        val s = "carerac"
        assertThat(solution.canPermutePalindrome(s)).isEqualTo(true)
    }
}
