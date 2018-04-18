package com.panibrat.array.Array_Partition_I_561

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val solution = Solution()

    @Test
    fun arrayPairSum1() {
        val input = intArrayOf(1, 4, 3, 2)
        assertThat(solution.arrayPairSum(input)).isEqualTo(4)
    }

    @Test
    fun arrayPairSum2() {
        val input = intArrayOf(1, 1)
        assertThat(solution.arrayPairSum(input)).isEqualTo(1)
    }
}