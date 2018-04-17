package com.panibrat.Student_Attendance_Record_I_551

/*
551. Student Attendance Record I

You are given a string representing an attendance record for a student. The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.

A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True

Example 2:
Input: "PPALLL"
Output: False

 */

class Solution {
    fun checkRecord(s: String): Boolean {
        var absent = 0
        for (i in s.indices) {
            when (s[i]) {
                'A' -> if (++absent > 1) return false
                'L' -> if (i < s.length - 2 && s[i + 1] == 'L' && s[i + 2] == 'L') return false
            }
        }
        return true
    }
}