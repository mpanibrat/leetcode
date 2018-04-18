package com.panibrat.string.Longest_Uncommon_Subsequence_I_521

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val solution = Solution()

    @Test
    fun findLUSlength() {
        assertThat(solution.findLUSlength("aba", "cdc")).isEqualTo(3)
    }
}