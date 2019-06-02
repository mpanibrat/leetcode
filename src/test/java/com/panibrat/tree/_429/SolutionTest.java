package com.panibrat.tree._429;

import static org.assertj.core.api.Assertions.assertThat;

import com.panibrat.tree.NaryTree.Node;
import java.util.List;
import org.junit.Test;

/*
429. N-ary Tree Level Order Traversal

Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example, given a 3-ary tree:

      1
    / | \
  3   2   4
 / \       \
5   6       7


We should return its level order traversal:

[
     [1],
     [3,2,4],
     [5,6,7]
]
 */
public class SolutionTest {

  @Test
  public void levelOrder() {
    Node n5 = new Node(5, List.of());
    Node n6 = new Node(6, List.of());
    Node n7 = new Node(7, List.of());
    Node n2 = new Node(2, List.of());
    Node n3 = new Node(3, List.of(n5, n6));
    Node n4 = new Node(4, List.of(n7));
    Node root = new Node(1, List.of(n3, n2, n4));

    List<List<Integer>> expected = List.of(List.of(1), List.of(3, 2, 4), List.of(5, 6, 7));
    List<List<Integer>> lists = new Solution().levelOrder(root);
    assertThat(lists).containsExactlyElementsOf(expected);
  }
}
