package com.panibrat.tree._559;


import static org.assertj.core.api.Assertions.assertThat;

import com.panibrat.tree.NaryTree.Node;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

/*
559. Maximum Depth of N-ary Tree

Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

For example, given a 3-ary tree:

     1
    /|\
   3 2 4
  /\
 5  6

We should return its max depth, which is 3.


Note:

1. The depth of the tree is at most 1000.
2. The total number of nodes is at most 5000.
 */
public class SolutionTest {

  @Test
  public void maxDepth() {
    Node n5 = new Node(5, Collections.emptyList());
    Node n6 = new Node(6, Collections.emptyList());
    Node n3 = new Node(3, Arrays.asList(n5, n6));
    Node n4 = new Node(4, Collections.emptyList());
    Node n2 = new Node(2, Collections.emptyList());
    Node ternary = new Node(1, Arrays.asList(n3, n2, n4));
    assertThat(new Solution().maxDepth(ternary)).isEqualTo(3);
  }
}