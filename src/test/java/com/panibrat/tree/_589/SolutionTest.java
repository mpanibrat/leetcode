package com.panibrat.tree._589;

import static org.assertj.core.api.Assertions.assertThat;

import com.panibrat.tree.NaryTree;
import com.panibrat.tree.NaryTree.Node;
import java.util.Arrays;
import org.junit.Test;

/*
589. N-ary Tree Preorder Traversal

Given an n-ary tree, return the preorder traversal of its nodes' values.

For example, given a 3-ary tree:

        1
      / | \
     3  2  4
    / \
   5   6

Return its preorder traversal as: [1,3,5,6,2,4].


Note:
- Recursive solution is trivial, could you do it iteratively?
 */
public class SolutionTest {

  @Test
  public void preorder() {
    Node root = NaryTree.of(1, NaryTree.of(3, 5, 6), NaryTree.leaf(2), NaryTree.leaf(4));
    assertThat(new Solution().preorder(root))
        .containsExactlyElementsOf(Arrays.asList(1, 3, 5, 6, 2, 4));
  }
}
