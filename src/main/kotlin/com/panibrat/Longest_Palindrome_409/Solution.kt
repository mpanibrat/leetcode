package com.panibrat.Longest_Palindrome_409

/*
409. Longest Palindrome

Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

 */

class Solution {
    fun longestPalindrome(s: String): Int {
        val map = IntArray(128)
        s.forEach { map[it.toInt()]++ }
        val length = map.fold(0) { sum, value -> sum + (value / 2) * 2 }
        return if (length == s.length) length else length + 1
    }
}
