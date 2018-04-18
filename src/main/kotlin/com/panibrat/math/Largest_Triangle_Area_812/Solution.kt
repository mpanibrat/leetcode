package com.panibrat.math.Largest_Triangle_Area_812

/*
812. Largest Triangle Area

You have a list of points in the plane. Return the area of the largest triangle that can be formed by any 3 of the points.

Example:
Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
Output: 2
Explanation:
The five points are show in the figure below. The red triangle is the largest.


Notes:

3 <= points.length <= 50.
No points will be duplicated.
 -50 <= points[i][j] <= 50.
Answers within 10^-6 of the true value will be accepted as correct.

 */

class Solution {
    fun largestTriangleArea(points: Array<IntArray>): Double {
        var largestArea = 0.0
        for (i in points.indices) {
            for (j in i..points.lastIndex) {
                for (k in j..points.lastIndex) {
                    largestArea = maxOf(largestArea, area(points[i], points[j], points[k]))
                }
            }
        }
        return largestArea
    }

    private fun area(A: IntArray, B: IntArray, C: IntArray): Double {
        return 0.5 * Math.abs(A[0] * B[1] + B[0] * C[1] + C[0] * A[1] - A[1] * B[0] - B[1] * C[0] - C[1] * A[0])
    }
}