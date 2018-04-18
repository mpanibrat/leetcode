package com.panibrat.string.Judge_Route_Circle_657

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun judgeCircle1() {
        val solution = Solution()
        val moves = "UD"
        assertThat(solution.judgeCircle(moves)).isEqualTo(true)
    }

    @Test
    fun judgeCircle2() {
        val solution = Solution()
        val moves = "LL"
        assertThat(solution.judgeCircle(moves)).isEqualTo(false)
    }
}