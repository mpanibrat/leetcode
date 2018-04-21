package com.panibrat.array.Plus_One_66

/*
66. Plus One

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,485,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

 */

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        for (i in digits.lastIndex downTo 0) {
            if (carry == 1 && digits[i] == 9) {
                digits[i] = 0
            } else {
                digits[i] += carry
                carry = 0
            }
        }
        if (carry == 1) {
            val array = IntArray(digits.size + 1)
            array[0] = 1
            System.arraycopy(digits, 0, array, 1, digits.size)
            return array
        }
        return digits
    }
}