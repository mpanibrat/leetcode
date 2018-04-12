package com.panibrat.Palindrome_Permutation_266

/*
266. Palindrome Permutation

Given a string, determine if a permutation of the string could form a palindrome.

For example,
"code" -> False, "aab" -> True, "carerac" -> True.
 */

class Solution {
    fun canPermutePalindrome(s: String): Boolean {
        val set = HashSet<Char>()
        s.forEach { if (!set.add(it)) set.remove(it) }
        return set.size <= 1
    }
}