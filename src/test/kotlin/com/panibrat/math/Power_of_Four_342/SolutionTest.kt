package com.panibrat.math.Power_of_Four_342

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun isPowerOfFour() {
        assertTrue(sol.isPowerOfFour(64))
    }

    @Test
    fun isPowerOfFourNegative() {
        assertFalse(sol.isPowerOfFour(-4))
    }

    @Test
    fun isPowerOfFourZero() {
        assertFalse(sol.isPowerOfFour(0))
    }

    @Test
    fun isNotPowerOfFour() {
        assertFalse(sol.isPowerOfFour(5))
    }
}