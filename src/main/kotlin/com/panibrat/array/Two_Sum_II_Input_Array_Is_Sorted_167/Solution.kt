package com.panibrat.array.Two_Sum_II_Input_Array_Is_Sorted_167

/*
167. Two Sum II - Input array is sorted

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var low = 0
        var high = numbers.lastIndex
        while (low < high) {
            val sum = numbers[low] + numbers[high]
            when {
                sum > target -> high--
                sum < target -> low++
                else -> return intArrayOf(low + 1, high + 1)
            }
        }
        throw IllegalArgumentException()
    }
}