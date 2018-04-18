package com.panibrat.math.Power_of_Three_326

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun isPowerOfThree27() {
        assertTrue(sol.isPowerOfThree(27))
    }

    @Test
    fun isPowerOfThreeNegative() {
        assertFalse(sol.isPowerOfThree(-3))
    }

    @Test
    fun isPowerOfThreeZero() {
        assertFalse(sol.isPowerOfThree(0))
    }

    @Test
    fun isPowerOfThreeFollowUp27() {
        assertTrue(sol.isPowerOfThreeFollowUp(27))
    }

    @Test
    fun isPowerOfThreeFollowUpNegative() {
        assertFalse(sol.isPowerOfThreeFollowUp(-3))
    }

    @Test
    fun isPowerOfThreeFollowUpZero() {
        assertFalse(sol.isPowerOfThreeFollowUp(0))
    }
}