package com.panibrat.Similar_RGB_Color_800

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val solution = Solution()

    @Test
    fun similarRGB() {
        val input = "#09f166"
        val output = "#11ee66"
        assertThat(solution.similarRGB(input)).isEqualTo(output)
    }
}