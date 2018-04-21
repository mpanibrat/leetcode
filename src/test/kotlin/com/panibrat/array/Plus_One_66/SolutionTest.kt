package com.panibrat.array.Plus_One_66

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun plusOne() {
        val input = intArrayOf(1, 2, 3, 4)
        val output = intArrayOf(1, 2, 3, 5)
        assertThat(sol.plusOne(input)).isEqualTo(output)
    }

    @Test
    fun plusOne9() {
        val input = intArrayOf(9, 9)
        val output = intArrayOf(1, 0, 0)
        assertThat(sol.plusOne(input)).isEqualTo(output)
    }
}