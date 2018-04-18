package com.panibrat.string.Flip_Game_293

/*
293. Flip Game

You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move and therefore the other person will be the winner.

Write a function to compute all possible states of the string after one valid move.

For example, given s = "++++", after one move, it may become one of the following states:

[
  "--++",
  "+--+",
  "++--"
]
If there is no valid move, return an empty list [].
 */

class Solution {
    fun generatePossibleNextMoves(s: String): List<String> {
        val result = mutableListOf<String>()
        var index = s.indexOf("++")
        while (index >= 0) {
            result.add(s.substring(0, index) + "--" + s.substring(index + 2))
            index = s.indexOf("++", index + 1)
        }
        return result
    }
}