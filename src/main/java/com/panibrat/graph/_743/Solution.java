package com.panibrat.graph._743;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/*
743. Network Delay Time

There are N network nodes, labelled 1 to N.

Given times, a list of travel times as directed edges times[i] = (u, v, w), where u is the source node, v is the target node, and w is the time it takes for a signal to travel from source to target.

Now, we send a signal from a certain node K. How long will it take for all nodes to receive the signal? If it is impossible, return -1.


Example 1:

Input: times = [[2,1,1],[2,3,1],[3,4,1]], N = 4, K = 2
Output: 2


Note:
- N will be in the range [1, 100].
- K will be in the range [1, N].
- The length of times will be in the range [1, 6000].
- All edges times[i] = (u, v, w) will have 1 <= u, v <= N and 0 <= w <= 100.
 */
class Solution {
  public int networkDelayTime(int[][] times, int N, int K) {
    Map<Integer, List<Edge>> graph = new HashMap<>();
    for (int i = 1; i <= N; i++) {
      graph.put(i, new ArrayList<>());
    }
    for (int[] time : times) {
      graph.get(time[0]).add(new Edge(time[1], time[2]));
    }

    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparing(a -> a.distance));
    queue.add(new Edge(K, 0));

    Set<Integer> visited = new HashSet<>();
    int delay = 0;

    while (!queue.isEmpty()) {
      Edge edge = queue.remove();
      if (!visited.add(edge.node)) {
        continue; // already visited
      }

      delay = edge.distance;
      if (graph.containsKey(edge.node)) {
        for (Edge next : graph.get(edge.node)) {
          queue.add(new Edge(next.node, edge.distance + next.distance));
        }
      }
    }

    return visited.size() == N ? delay : -1;
  }

  private static class Edge {
    private final int node;
    private final int distance;

    Edge(int node, int distance) {
      this.node = node;
      this.distance = distance;
    }
  }
}