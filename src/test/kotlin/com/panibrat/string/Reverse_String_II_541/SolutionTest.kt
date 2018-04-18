package com.panibrat.string.Reverse_String_II_541

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun reverseStr() {
        val s = "abcdefg"
        val k = 2
        val out = "bacdfeg"
        assertThat(sol.reverseStr(s, k)).isEqualTo(out)
    }
}