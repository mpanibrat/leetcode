package com.panibrat.hashtable.Strobogrammatic_Number_246

import com.panibrat.utils.asDigit

/*
246. Strobogrammatic Number

A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Write a function to determine if a number is strobogrammatic. The number is represented as a string.

For example, the numbers "69", "88", and "818" are all strobogrammatic.

 */

class Solution {
    fun isStrobogrammatic(num: String): Boolean {
        val map = listOf('0', '1', '-', '-', '-', '-', '9', '-', '8', '6')
        var left = 0
        var right = num.lastIndex
        while (left <= right) {
            if (map[num[left++].asDigit()] != num[right--]) return false
        }
        return true
    }
}