package com.panibrat.string.Bold_Words_in_String_758

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    /*
    words = ["ab", "bc"] and S = "aabcd", we should return "a<b>abc</b>d"
     */
    @Test
    fun boldWords() {
        val words = arrayOf("ab", "bc")
        val S = "aabcd"
        val result = "a<b>abc</b>d"
        assertThat(sol.boldWords(words, S)).isEqualTo(result)
    }
}