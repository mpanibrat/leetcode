package com.panibrat.Max_Consecutive_Ones_485

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val solution = Solution()

    @Test
    fun findMaxConsecutiveOnes() {
        val input = intArrayOf(1, 1, 0, 1, 1, 1)
        assertThat(solution.findMaxConsecutiveOnes(input)).isEqualTo(3)
    }
}