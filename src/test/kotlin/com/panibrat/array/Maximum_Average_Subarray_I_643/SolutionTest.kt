package com.panibrat.array.Maximum_Average_Subarray_I_643

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()
    @Test
    fun findMaxAverage() {
        val input = intArrayOf(1, 12, -5, -6, 50, 3)
        assertThat(sol.findMaxAverage(input, 4)).isEqualTo(12.75)
    }
}