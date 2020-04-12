package com.panibrat.codility;

import java.util.PriorityQueue;
import java.util.Queue;

/*
Merging a sorted list consisting of K elements with a sorted list consisting of L elements takes (K+L) milliseconds (ms). The time required to merge more than two lists into one final list depends on the order in which the merges are performed.

For example, consider the following three lists:

 - list P consisting of 100 elements,
 - list Q consisting of 250 elements,
 - list R consisting of 1000 elements.

They can be merged into one final sorted list in three different ways:

 - first merge P with Q , then merge the result with R ; or
 - first merge P with R , then merge the result with Q ; or
 - first merge R with Q , then merge the result with P .

The times needed to perform the above merges are respectively:

 - merge P with Q : 350ms; result with R : 1350ms; total: 1700ms;
 - merge P with R : 1100ms; result with Q : 1350ms; total: 2450ms;
 - merge Q with R : 1250ms; result with P : 1350ms; total: 2600ms.

The first schema is the fastest (1700ms).

If there are more than three lists to merge, there are even more merge strategies to consider. When the number of lists to merge is fewer than two, no merges are performed and the total merge time is assumed to be 0.

Write a function that, given an array A of length N describing the lengths of N lists, returns the shortest time (measured in milliseconds) required to merge these lists into one.

For example, given array A consisting of three elements such that:

A[0] = 100
A[1] = 250
A[2] = 1000

the function should return 1700, as explained above.

Write an efficient algorithm for the following assumptions:

 - N is an integer within the range [0..10,000] ;
 - each element of array A is an integer within the range [1..1,000].
 */
public class MinTimeToMergeLists {
  public int solution(int[] A) {
    Queue<Integer> heap = new PriorityQueue<>();
    for (int n : A) {
      heap.add(n);
    }
    int totalTime = 0;
    while (heap.size() > 1) {
      int time = heap.remove() + heap.remove();
      totalTime += time;
      heap.add(time);
    }
    return totalTime;
  }
}
