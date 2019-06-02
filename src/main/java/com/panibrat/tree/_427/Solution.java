package com.panibrat.tree._427;

import com.panibrat.tree.QuadTree.Node;

/*
427. Construct Quad Tree

We want to use quad trees to store an N x N boolean grid. Each cell in the grid can only be true or false. The root node represents the whole grid. For each node, it will be subdivided into four children nodes until the values in the region it represents are all the same.

Each node has another two boolean attributes : isLeaf and val. isLeaf is true if and only if the node is a leaf node. The val attribute for a leaf node contains the value of the region it represents.

Your task is to use a quad tree to represent a given grid.

The corresponding quad tree should be as following, where each node is represented as a (isLeaf, val) pair.

For the non-leaf nodes, val can be arbitrary, so it is represented as *.



Note:

N is less than 1000 and guaranteed to be a power of 2.
If you want to know more about the quad tree, you can refer to its wiki.
 */
class Solution {

  private static Node helper(int[][] grid, int size, int row, int col) {
    if (isUniform(grid, size, row, col)) {
      return leaf(grid[row][col]);
    }
    return subdivide(grid, size / 2, row, col);
  }

  private static Node subdivide(int[][] grid, int size, int row, int col) {
    return new Node(
        false,
        false,
        helper(grid, size, row, col),
        helper(grid, size, row, col + size),
        helper(grid, size, row + size, col),
        helper(grid, size, row + size, col + size));
  }

  private static Node leaf(int value) {
    return new Node(value == 1, true, null, null, null, null);
  }

  private static boolean isUniform(int[][] grid, int size, int row, int col) {
    int sample = grid[row][col];
    for (int i = row + size - 1; i >= row; i--) {
      for (int j = col + size - 1; j >= col; j--) {
        if (grid[i][j] != sample) {
          return false;
        }
      }
    }
    return true;
  }

  public Node construct(int[][] grid) {
    return helper(grid, grid.length, 0, 0);
  }
}
