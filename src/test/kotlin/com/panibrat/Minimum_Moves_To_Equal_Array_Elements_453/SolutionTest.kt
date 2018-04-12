package com.panibrat.Minimum_Moves_To_Equal_Array_Elements_453

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val solution = Solution()

    @Test
    fun minMoves() {
        val input = intArrayOf(1, 2, 3)
        assertThat(solution.minMoves(input)).isEqualTo(3)
    }
}