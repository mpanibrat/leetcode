package com.panibrat.array.Maximum_Average_Subarray_I_643

/*
643. Maximum Average Subarray I

Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:
Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75

Note:
- 1 <= k <= n <= 30,000.
- Elements of the given array will be in the range [-10,000, 10,000].

 */

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = nums.take(k).sumByDouble { it.toDouble() }
        var max = sum
        nums.drop(k).forEachIndexed { index, value ->
            sum += value - nums[index]
            max = maxOf(max, sum)
        }
        return max / k
    }
}