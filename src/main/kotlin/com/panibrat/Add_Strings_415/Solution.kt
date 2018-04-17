package com.panibrat.Add_Strings_415

/*
415. Add Strings

Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

- The length of both num1 and num2 is < 5100.
- Both num1 and num2 contains only digits 0-9.
- Both num1 and num2 does not contain any leading zero.
- You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

class Solution {
    fun addStrings(num1: String, num2: String): String {
        var carry = 0
        var i = num1.lastIndex
        var j = num2.lastIndex
        val builder = StringBuilder()
        while (i >= 0 || j >= 0 || carry == 1) {
            val sum = num1.digitAt(i--) + num2.digitAt(j--) + carry
            builder.append(sum % 10)
            carry = sum / 10
        }
        return builder.reverse().toString()
    }
}

private fun String.digitAt(index: Int): Int {
    if (index !in this.indices) return 0
    return this[index].asDigit()
}

private fun Char.asDigit(): Int {
    return this - '0'
}
