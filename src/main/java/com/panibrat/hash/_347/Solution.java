package com.panibrat.hash._347;

/*
347. Top K Frequent Elements

Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
  public List<Integer> topKFrequent(int[] nums, int k) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int x : nums) {
      if (x > max) max = x;
      if (x < min) min = x;
    }
    int[] freq = new int[max - min + 1];
    for (int x : nums) freq[x - min]++;

    List<Integer>[] buckets = new List[nums.length + 1];
    for (int i = 0; i < freq.length; i++) {
      int f = freq[i];
      if (f > 0) {
        if (buckets[f] == null) buckets[f] = new ArrayList<>();
        buckets[f].add(min + i);
      }
    }

    List<Integer> top = new ArrayList<>();
    for (int i = nums.length; i > 0 && top.size() < k; i--) {
      if (buckets[i] != null) top.addAll(buckets[i]);
    }
    return top;
  }

  public List<Integer> topKFrequentSlow(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparing(map::get).reversed());
    heap.addAll(map.keySet());

    List<Integer> top = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      top.add(heap.remove());
    }
    return top;
  }
}
