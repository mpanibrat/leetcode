package com.panibrat.Find_Anagram_Mappings_760

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun anagramMappings() {
        val a = intArrayOf(12, 28, 46, 32, 50)
        val b = intArrayOf(50, 12, 32, 46, 28)
        val c = intArrayOf(1, 4, 3, 2, 0)
        val solution = Solution()
        assertThat(solution.anagramMappings(a, b)).isEqualTo(c)
    }
}