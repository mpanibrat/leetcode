package com.panibrat.math.Power_of_Three_326

/*
326. Power of Three

Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
 */

class Solution {
    private val base = 3

    fun isPowerOfThree(n: Int): Boolean {
        if (n < 1) return false
        var value = n
        while (value % base == 0) value /= base
        return value == 1
    }

    fun isPowerOfThreeFollowUp(n: Int): Boolean {
        val exponent = Math.floor(Math.log10(Int.MAX_VALUE.toDouble()) / Math.log10(3.0)) // 19
        val maxValue = Math.pow(3.0, exponent).toInt() // 1162261467
        return n > 0 && maxValue % n == 0
    }

    fun isPowerOfThreeFollowUpDoublePrecision(n: Int): Boolean {
        if (n < 1) return false
        val exponent = Math.log10(n.toDouble()) / Math.log10(base.toDouble())
        return exponent == Math.floor(exponent)
    }
}