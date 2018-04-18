package com.panibrat.bitManipulation.Power_of_Two_231

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun isPowerOfTwo() {
        assertTrue(sol.isPowerOfTwo(32))
    }

    @Test
    fun isPowerOfTwo0() {
        assertFalse(sol.isPowerOfTwo(0))
    }

    @Test
    fun isPowerOfTwoNegative() {
        assertFalse(sol.isPowerOfTwo(-2147483648))
    }

}