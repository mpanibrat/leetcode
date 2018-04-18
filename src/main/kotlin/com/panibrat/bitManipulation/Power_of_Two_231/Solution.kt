package com.panibrat.bitManipulation.Power_of_Two_231

/*
231. Power of Two

Given an integer, write a function to determine if it is a power of two.
 */
class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && (n and n - 1 == 0)
    }
}