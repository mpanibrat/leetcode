package com.panibrat.array.Max_Consecutive_Ones_485

/*
485. Max Consecutive Ones

Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 */

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var current = 0
        for (n in nums) {
            if (n == 0) current = 0
            else current++
            max = maxOf(max, current)
        }
        return max
    }
}