package com.panibrat.First_Unique_Character_in_a_String_387

/*
387. First Unique Character in a String

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

 */

class Solution {
    fun firstUniqChar(s: String): Int {
        val map = IntArray(128)
        s.forEach { map[it.toInt()]++ }
        for (i in s.indices) {
            if (map[s[i].toInt()] == 1) return i
        }
        return -1
    }
}