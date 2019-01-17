package com.panibrat.backtracking.Island_Perimeter_463

/*
463. Island Perimeter

You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
Explanation: The perimeter is the 16 yellow stripes in the image below:

 */

class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var perimeter = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == 1) {
                    perimeter += 4
                    if (i > 0 && grid[i - 1][j] == 1) perimeter -= 2
                    if (j > 0 && grid[i][j - 1] == 1) perimeter -= 2
                }
            }
        }
        return perimeter
    }
}