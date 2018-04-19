package com.panibrat.math.Power_of_Four_342

/*
342. Power of Four

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?

 */

class Solution {
    fun isPowerOfFour(num: Int): Boolean {
        if (num < 1) return false
        val exponent = Math.log10(num.toDouble()) / Math.log10(4.0)
        return exponent == Math.floor(exponent)
    }
}