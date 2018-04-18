package com.panibrat.dynamic.Rotated_Digits_788

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun rotatedDigits() {
        assertThat(s.rotatedDigits(10)).isEqualTo(4)
    }
}