package com.panibrat.string.Reverse_Vowels_of_a_String_345

import com.panibrat.utils.isVowel
import com.panibrat.utils.swap

/*
345. Reverse Vowels of a String

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
 */

class Solution {
    fun reverseVowels(s: String): String {
        val array = s.toCharArray()
        var left = 0
        var right = array.lastIndex
        while (left < right) {
            if (!array[left].isVowel()) {
                left++; continue
            }
            if (!array[right].isVowel()) {
                right--; continue
            }
            array.swap(left++, right--)
        }
        return String(array)
    }
}
