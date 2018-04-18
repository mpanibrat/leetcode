package com.panibrat.hashtable.Number_of_Boomerangs_447

/*
447. Number of Boomerangs

Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

Example:
Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]

 */

class Solution {
    fun numberOfBoomerangs(points: Array<IntArray>): Int {
        var total = 0
        val map = HashMap<Int, Int>()
        points.forEach { a ->
            points.forEach { b ->
                val d = distance(a, b)
                map[d] = map.getOrDefault(d, 0) + 1
            }
            map.values.forEach { v -> total += v * (v - 1) }
            map.clear()
        }
        return total
    }

    private fun distance(a: IntArray, b: IntArray): Int {
        val dx = a[0] - b[0]
        val dy = a[1] - b[1]
        return dx * dx + dy * dy
    }
}