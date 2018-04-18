package com.panibrat.design.Relative_Ranks_506

/*
506. Relative Ranks

Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
For the left two athletes, you just need to output their relative ranks according to their scores.

Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.

 */

class Solution {
    fun findRelativeRanks(nums: IntArray): Array<String> {
        val result = Array(nums.size) { "" }
        val medal = mapOf(
                0 to "Gold Medal",
                1 to "Silver Medal",
                2 to "Bronze Medal")

        nums.mapIndexed { index, score -> Pair(score, index) }
                .sortedByDescending { it.first }
                .forEachIndexed { rank, (_, index) ->
                    result[index] = medal[rank] ?: (rank + 1).toString()
                }

        return result
    }
}
