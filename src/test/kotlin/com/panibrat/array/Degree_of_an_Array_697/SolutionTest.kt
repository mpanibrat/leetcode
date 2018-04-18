package com.panibrat.array.Degree_of_an_Array_697

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val solution = Solution()

    @Test
    fun findShortestSubArrayExample1() {
        val array = intArrayOf(1, 2, 2, 3, 1)
        assertThat(solution.findShortestSubArray(array)).isEqualTo(2)
    }

    @Test
    fun findShortestSubArrayExample2() {
        val array = intArrayOf(1, 2, 2, 3, 1, 4, 2)
        assertThat(solution.findShortestSubArray(array)).isEqualTo(6)
    }
}