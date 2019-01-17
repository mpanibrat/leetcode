package com.panibrat.graph._207;

/*
207. Course Schedule

There are a total of n courses you have to take, labeled from 0 to n-1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

Example 1:

Input: 2, [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take.
             To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: 2, [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take.
             To take course 1 you should have finished course 0, and to take course 0 you should
             also have finished course 1. So it is impossible.
Note:

The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
You may assume that there are no duplicate edges in the input prerequisites.

 */

import java.util.ArrayList;
import java.util.List;

class Solution {
  private static final int NOT_VISITED = 0;
  private static final int IN_PROGRESS = 1;
  private static final int VISITED = 2;

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    int[] state = new int[numCourses];
    List<Integer>[] edges = new List[numCourses];
    for (int i = 0; i < numCourses; i++) edges[i] = new ArrayList<>();
    for (int[] pair : prerequisites) edges[pair[1]].add(pair[0]);
    for (int i = 0; i < numCourses; i++) {
      if (hasCycle(i, state, edges)) return false;
    }
    return true;
  }

  private boolean hasCycle(int vertex, int[] state, List<Integer>[] edges) {
    if (state[vertex] != NOT_VISITED) return state[vertex] == IN_PROGRESS;
    state[vertex] = IN_PROGRESS;
    for (int edge : edges[vertex]) {
      if (hasCycle(edge, state, edges)) return true;
    }
    state[vertex] = VISITED;
    return false;
  }
}
