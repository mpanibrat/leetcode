package com.panibrat.binarySearch.Guess_Number_Higher_or_Lower_374

/*
374. Guess Number Higher or Lower

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!

Example:
n = 10, I pick 6.

Return 6.
 */
class Solution(private val picked: Int = 1) {

    fun guessNumber(n: Int): Int {
        var low = 1
        var high = n
        var number = low + (high - low) / 2
        var result = guess(number)
        while (result != 0) {
            if (result < 0) high = number - 1
            else low = number + 1
            number = low + (high - low) / 2
            result = guess(number)
        }
        return number
    }

    private fun guess(n: Int): Int {
        if (n == picked) return 0
        if (n < picked) return 1
        return -1
    }
}
