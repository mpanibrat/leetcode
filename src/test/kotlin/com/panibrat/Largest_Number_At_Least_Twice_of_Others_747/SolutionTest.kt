package com.panibrat.Largest_Number_At_Least_Twice_of_Others_747

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun dominantIndexExample1() {
        val nums = intArrayOf(3, 6, 1, 0)
        assertThat(sol.dominantIndex(nums)).isEqualTo(1)
    }

    @Test
    fun dominantIndexExample2() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertThat(sol.dominantIndex(nums)).isEqualTo(-1)
    }
}