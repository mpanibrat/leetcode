package com.panibrat.binarySearch.Guess_Number_Higher_or_Lower_374

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun guessNumber() {
        val sol = Solution(6)
        assertThat(sol.guessNumber(10)).isEqualTo(6)
    }

    @Test
    fun guessNumberMax() {
        val sol = Solution(Int.MAX_VALUE)
        assertThat(sol.guessNumber(Int.MAX_VALUE)).isEqualTo(Int.MAX_VALUE)
    }

    @Test
    fun guessNumber1() {
        val sol = Solution(1)
        assertThat(sol.guessNumber(1)).isEqualTo(1)
    }
}