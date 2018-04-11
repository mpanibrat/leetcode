package com.panibrat.FindAllNumbersDisappearedInAnArray448

/*
448. Find All Numbers Disappeared in an Array

Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 */
class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val list = ArrayList<Int>()

        nums.forEach { nums[(it - 1) % nums.size] += nums.size } // modifies input

        for (i in nums.indices) {
            if (nums[i] <= nums.size) list.add(i + 1)
        }
        return list
    }
}