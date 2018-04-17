package com.panibrat.Student_Attendance_Record_I_551

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun checkRecordExample1() {
        assertTrue(sol.checkRecord("PPALLP"))
    }

    @Test
    fun checkRecordExample2() {
        assertFalse(sol.checkRecord("PPALLL"))
    }

    @Test
    fun checkRecordExample3() {
        assertTrue(sol.checkRecord("LLPPPLL"))
    }
}