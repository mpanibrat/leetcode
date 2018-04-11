package com.panibrat.IntersectionOfTwoArrays349

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val solution = Solution()

    @Test
    fun intersection() {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val result = intArrayOf(2)
        assertThat(solution.intersection(nums1, nums2)).isEqualTo(result)
    }
}