package com.panibrat.Largest_Triangle_Area_812

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.byLessThan
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun largestTriangleArea() {
        // [0,0],[0,1],[1,0],[0,2],[2,0]
        val points = arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, 1),
                intArrayOf(1, 0),
                intArrayOf(0, 2),
                intArrayOf(2, 0)
        )
        assertThat(s.largestTriangleArea(points)).isCloseTo(2.0, byLessThan(0.0000001))
    }
}