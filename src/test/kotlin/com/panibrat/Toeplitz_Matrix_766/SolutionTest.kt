package com.panibrat.Toeplitz_Matrix_766

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun isToeplitzMatrixExample1() {
        val solution = Solution()
        val matrix = arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 1, 2, 3),
                intArrayOf(9, 5, 1, 2))
        assertThat(solution.isToeplitzMatrix(matrix)).isEqualTo(true)
    }

    @Test
    fun isToeplitzMatrixExample2() {
        val solution = Solution()
        val matrix = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(1, 2))
        assertThat(solution.isToeplitzMatrix(matrix)).isEqualTo(false)
    }
}