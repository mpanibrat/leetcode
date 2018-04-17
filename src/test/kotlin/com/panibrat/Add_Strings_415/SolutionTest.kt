package com.panibrat.Add_Strings_415

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun addStrings() {
        assertThat(sol.addStrings("999", "338")).isEqualTo("1337")
    }
}