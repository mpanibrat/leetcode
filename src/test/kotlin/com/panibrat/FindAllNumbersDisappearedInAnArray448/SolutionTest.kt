package com.panibrat.FindAllNumbersDisappearedInAnArray448

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun findDisappearedNumbers() {
        val input = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
        val output = listOf(5, 6)
        assertThat(solution.findDisappearedNumbers(input)).isEqualTo(output)
    }
}