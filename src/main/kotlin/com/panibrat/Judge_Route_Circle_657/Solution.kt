package com.panibrat.Judge_Route_Circle_657

/*
657. Judge Route Circle

Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character.
The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true

Example 2:
Input: "LL"
Output: false

 */
class Solution {
    fun judgeCircle(moves: String): Boolean {
        val r = IntArray(2)
        moves.forEach { c ->
            when (c) {
                'U' -> r[0]++
                'D' -> r[0]--
                'L' -> r[1]++
                'R' -> r[1]--
            }
        }
        return r[0] == 0 && r[1] == 0
    }
}