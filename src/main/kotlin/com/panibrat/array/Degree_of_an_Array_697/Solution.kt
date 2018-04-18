package com.panibrat.array.Degree_of_an_Array_697

/*
697. Degree of an Array

Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example 1:
Input: [1, 2, 2, 3, 1]
Output: 2
Explanation:
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.

Example 2:
Input: [1,2,2,3,1,4,2]
Output: 6

Note:

nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.
 */

class Solution {
    fun findShortestSubArray(nums: IntArray): Int {
        val map = mutableMapOf<Int, SubArray>()
        for ((i, n) in nums.withIndex()) {
            val sub = map.getOrPut(n, { SubArray(i) })
            sub.degree++
            sub.size = i - sub.start + 1
        }
        return map.values.maxWith(Comparator { o1, o2 ->
            when {
                o1.degree != o2.degree -> o1.degree - o2.degree
                else -> o2.size - o1.size
            }
        })!!.size
    }
}

data class SubArray(val start: Int, var size: Int = 0, var degree: Int = 0)
