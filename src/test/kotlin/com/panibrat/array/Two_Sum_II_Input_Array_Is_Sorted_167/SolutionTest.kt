package com.panibrat.array.Two_Sum_II_Input_Array_Is_Sorted_167

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val solution = Solution()

    @Test
    fun twoSum() {
        val array = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = intArrayOf(1, 2)
        assertThat(solution.twoSum(array, target)).isEqualTo(result)
    }
}