package com.panibrat.string.Detect_Capital_520

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun detectCapitalUseExample1() {
        val i = "USA"
        assertThat(s.detectCapitalUse(i)).isEqualTo(true)
    }

    @Test
    fun detectCapitalUseExample2() {
        val i = "FlaG"
        assertThat(s.detectCapitalUse(i)).isEqualTo(false)
    }
}