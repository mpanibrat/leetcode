package com.panibrat.hashtable.Strobogrammatic_Number_246

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun isStrobogrammatic69() {
        assertTrue(sol.isStrobogrammatic("69"))
    }

    @Test
    fun isStrobogrammatic818() {
        assertTrue(sol.isStrobogrammatic("818"))
    }

    @Test
    fun isStrobogrammatic88() {
        assertTrue(sol.isStrobogrammatic("88"))
    }

    @Test
    fun isStrobogrammatic42() {
        assertFalse(sol.isStrobogrammatic("42"))
    }

    @Test
    fun isStrobogrammatic2() {
        assertFalse(sol.isStrobogrammatic("2"))
    }
}