package com.panibrat.tree._590;

import static org.assertj.core.api.Assertions.assertThat;

import com.panibrat.tree.NaryTree;
import com.panibrat.tree.NaryTree.Node;
import java.util.Arrays;
import org.junit.Test;

/*
590. N-ary Tree Postorder Traversal

Given an n-ary tree, return the postorder traversal of its nodes' values.

For example, given a 3-ary tree:

        1
      / | \
     3  2  4
    / \
   5   6


Return its postorder traversal as: [5,6,3,2,4,1].


Note:

Recursive solution is trivial, could you do it iteratively?

 */
public class SolutionTest {

  @Test
  public void postorder() {
    Node root = NaryTree.of(1, NaryTree.of(3, 5, 6), NaryTree.leaf(2), NaryTree.leaf(4));
    assertThat(new Solution().postorder(root))
        .containsExactlyElementsOf(Arrays.asList(5, 6, 3, 2, 4, 1));
  }
}
