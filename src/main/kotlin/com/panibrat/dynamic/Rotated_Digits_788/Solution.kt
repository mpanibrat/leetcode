package com.panibrat.dynamic.Rotated_Digits_788

/*
788. Rotated Digits

X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.

A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.

Now given a positive number N, how many numbers X from 1 to N are good?

Example:
Input: 10
Output: 4
Explanation:
There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.

Note:

N  will be in range [1, 10000].
 */

class Solution {
    fun rotatedDigits(N: Int): Int {
        var count = 0
        val validDifferent = hashSetOf(2, 5, 6, 9)
        val validSame = hashSetOf(0, 1, 8)
        val dp = IntArray(N + 1)
        for (i in 0..10) {
            if (i > N) return count
            when (i) {
                in validSame -> dp[i] = 1
                in validDifferent -> {
                    dp[i] = 2
                    count++
                }
            }
        }
        for (i in 10..N) {
            val head = dp[i / 10]
            val tail = dp[i % 10]
            when {
                head == 1 && tail == 1 -> dp[i] = 1
                head >= 1 && tail >= 1 -> {
                    dp[i] = 2
                    count++
                }
            }
        }
        return count
    }
}