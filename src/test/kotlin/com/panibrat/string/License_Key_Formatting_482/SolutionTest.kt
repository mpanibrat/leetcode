package com.panibrat.string.License_Key_Formatting_482

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun licenseKeyFormattingExample1() {
        assertThat(sol.licenseKeyFormatting("5F3Z-2e-9-w", 4)).isEqualTo("5F3Z-2E9W")
    }

    @Test
    fun licenseKeyFormattingExample2() {
        assertThat(sol.licenseKeyFormatting("2-5g-3-J", 2)).isEqualTo("2-5G-3J")
    }

    @Test
    fun licenseKeyFormatting3() {
        assertThat(sol.licenseKeyFormatting("----2-5g-3-J------", 2)).isEqualTo("2-5G-3J")
    }
}