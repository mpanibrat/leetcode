package com.panibrat.string.Repeated_Substring_Pattern_459

/*
459. Repeated Substring Pattern

Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.

Example 2:
Input: "aba"
Output: False

Example 3:
Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */

class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        search@ for (size in s.length / 2 downTo 1) {
            if (s.length % size != 0) continue
            val sub = s.substring(0, size)
            for (i in s.length - size downTo size step size) {
                if (s.substring(i, i + size) != sub) continue@search
            }
            return true
        }
        return false
    }
}