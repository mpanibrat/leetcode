package com.panibrat.codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
There are N given points (numbered from 0 to N-1) on a plane. The K-th point is located at coordinates (X[K], Y[K]) and its tag is S[K]. We want to draw a circle centered on coordinates (0, 0). The circle should not contain two points with the same tag. What is the maximum number of points that can lie inside the circle?

Write a function that, given a string S of length N and two arrays X, Y consisting of N integers each, returns the maximum number of points inside the circle. The circle may contain only points with distinct tags, and is centered on coordinates (0, 0). Points that are on the border of the circle are included within it.

Examples:

1. Given S = "ABDCA", X = [2, -1, -4, -3, 3] and Y = [2, -2, 4, 1, -3], the function should return 3. There are three points that can be included in the circle: ("A", 2, 2), ("B", -1, -2), ("C", -3, 1). The next point ("A", 3, -3) has the same tag as ("A", 2, 2), so it cannot be included.
2. Given S = "ABB", X = [1, -2, -2] and Y = [1, -2, 2], the function should return 1.
3. Given S = "CCD", X = [1, -1, 2] and Y = [1, -1, -2], the function should return 0.
 */
public class MaxPointsInsideCircle {
  public int solution(String S, int[] X, int[] Y) {
    TreeMap<Double, List<Character>> map = new TreeMap<>();
    for (int i = 0; i < X.length; i++) {
      double distance = Math.sqrt((double) X[i] * X[i] + Y[i] * Y[i]);
      map.putIfAbsent(distance, new ArrayList<>());
      map.get(distance).add(S.charAt(i));
    }
    Set<Character> tags = new HashSet<>();
    int points = 0;
    for (Entry<Double, List<Character>> entry : map.entrySet()) {
      if (!entry.getValue().stream().allMatch(tags::add)) {
        return points;
      }
      points += entry.getValue().size();
    }
    return points;
  }
}
