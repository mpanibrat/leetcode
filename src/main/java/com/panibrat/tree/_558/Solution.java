package com.panibrat.tree._558;

import com.panibrat.tree.QuadTree.Node;

/*
558. Quad Tree Intersection

A quadtree is a tree data in which each internal node has exactly four children: topLeft, topRight, bottomLeft and bottomRight. Quad trees are often used to partition a two-dimensional space by recursively subdividing it into four quadrants or regions.

We want to store True/False information in our quad tree. The quad tree is used to represent a N * N boolean grid. For each node, it will be subdivided into four children nodes until the values in the region it represents are all the same. Each node has another two boolean attributes : isLeaf and val. isLeaf is true if and only if the node is a leaf node. The val attribute for a leaf node contains the value of the region it represents.

For example, below are two quad trees A and B:

A:
+-------+-------+   T: true
|       |       |   F: false
|   T   |   T   |
|       |       |
+-------+-------+
|       |       |
|   F   |   F   |
|       |       |
+-------+-------+
topLeft: T
topRight: T
bottomLeft: F
bottomRight: F

B:
+-------+---+---+
|       | F | F |
|   T   +---+---+
|       | T | T |
+-------+---+---+
|       |       |
|   T   |   F   |
|       |       |
+-------+-------+
topLeft: T
topRight:
     topLeft: F
     topRight: F
     bottomLeft: T
     bottomRight: T
bottomLeft: T
bottomRight: F


Your task is to implement a function that will take two quadtrees and return a quadtree that represents the logical OR (or union) of the two trees.

A:                 B:                 C (A or B):
+-------+-------+  +-------+---+---+  +-------+-------+
|       |       |  |       | F | F |  |       |       |
|   T   |   T   |  |   T   +---+---+  |   T   |   T   |
|       |       |  |       | T | T |  |       |       |
+-------+-------+  +-------+---+---+  +-------+-------+
|       |       |  |       |       |  |       |       |
|   F   |   F   |  |   T   |   F   |  |   T   |   F   |
|       |       |  |       |       |  |       |       |
+-------+-------+  +-------+-------+  +-------+-------+


Note:

1. Both A and B represent grids of size N * N.
2. N is guaranteed to be a power of 2.
3. If you want to know more about the quad tree, you can refer to its wiki.
4. The logic OR operation is defined as this: "A or B" is true if A is true, or if B is true, or if both A and B are true.
 */
class Solution {
  public Node intersect(Node q1, Node q2) {
    if (q1.isLeaf) {
      return q1.val ? q1 : q2;
    } else if (q2.isLeaf) {
      return q2.val ? q2 : q1;
    }

    Node topLeft = intersect(q1.topLeft, q2.topLeft);
    Node topRight = intersect(q1.topRight, q2.topRight);
    Node bottomLeft = intersect(q1.bottomLeft, q2.bottomLeft);
    Node bottomRight = intersect(q1.bottomRight, q2.bottomRight);

    // merge condition
    if (topLeft.isLeaf
        && topRight.isLeaf
        && bottomLeft.isLeaf
        && bottomRight.isLeaf
        && topLeft.val == topRight.val
        && bottomLeft.val == bottomRight.val
        && topLeft.val == bottomLeft.val) {
      return new Node(topLeft.val, true, null, null, null, null);
    }
    return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
  }
}
