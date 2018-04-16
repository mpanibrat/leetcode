package com.panibrat.Number_of_Boomerangs_447

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun numberOfBoomerangs() {
        val input = arrayOf(
                intArrayOf(0, 0),
                intArrayOf(1, 0),
                intArrayOf(2, 0)
        )
        assertThat(s.numberOfBoomerangs(input)).isEqualTo(2)
    }
}