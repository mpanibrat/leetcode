package com.panibrat.backtracking.Island_Perimeter_463

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun islandPerimeter() {
        val grid = arrayOf(
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 1, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 0, 0)
        )
        val solution = Solution()
        assertThat(solution.islandPerimeter(grid)).isEqualTo(16)
    }
}