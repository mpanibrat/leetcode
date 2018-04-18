package com.panibrat.string.Reverse_String_II_541

/*
541. Reverse String II


Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.

Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]

 */
class Solution {
    fun reverseStr(s: String, k: Int): String {
        val array = s.toCharArray()
        for (i in array.indices step 2 * k) {
            array.swap(i, minOf(i + k - 1, array.lastIndex))
        }
        return String(array)
    }
}

private fun CharArray.swap(start: Int, end: Int) {
    var lo = start
    var hi = end
    while (lo < hi) {
        val tmp = this[lo]
        this[lo++] = this[hi]
        this[hi--] = tmp
    }
}
