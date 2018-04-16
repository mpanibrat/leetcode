package com.panibrat.Relative_Ranks_506

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun findRelativeRanks() {
        val n = intArrayOf(5, 4, 3, 2, 1)
        val o = arrayOf("Gold Medal", "Silver Medal", "Bronze Medal", "4", "5")
        assertThat(s.findRelativeRanks(n)).isEqualTo(o)
    }

    @Test
    fun testEdgeCase() {
        val n = intArrayOf(1, 2, 3, 2147483646)
        val o = arrayOf("4", "Bronze Medal", "Silver Medal", "Gold Medal")
        assertThat(s.findRelativeRanks(n)).isEqualTo(o)
    }

}