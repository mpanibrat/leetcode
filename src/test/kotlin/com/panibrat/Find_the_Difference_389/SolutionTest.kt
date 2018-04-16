package com.panibrat.Find_the_Difference_389

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val solution = Solution()

    @Test
    fun findTheDifference() {
        val s = "abcd"
        val t = "abcde"
        assertThat(solution.findTheDifference(s, t)).isEqualTo('e')
    }
}