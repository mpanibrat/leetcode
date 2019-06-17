package com.panibrat.tree._559;

import com.panibrat.tree.NaryTree.Node;

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
class Solution {
  public int maxDepth(Node root) {
    if (root == null) {
      return 0;
    }
    int max = 0;
    for (Node node : root.children) {
      int depth = maxDepth(node);
      if (depth > max) {
        max = depth;
      }
    }
    return 1 + max;
  }
}
