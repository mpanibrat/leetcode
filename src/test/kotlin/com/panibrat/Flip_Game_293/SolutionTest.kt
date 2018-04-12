package com.panibrat.Flip_Game_293

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    val solution = Solution()

    @Test
    fun generatePossibleNextMoves() {
        val s = "++++"
        val output = listOf(
                "--++",
                "+--+",
                "++--")
        assertThat(solution.generatePossibleNextMoves(s)).isEqualTo(output)
    }
}