package com.panibrat.tree;

public interface QuadTree {

  /** Definition for a QuadTree node. */
  class Node {

    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(
        boolean val,
        boolean isLeaf,
        Node topLeft,
        Node topRight,
        Node bottomLeft,
        Node bottomRight) {
      this.val = val;
      this.isLeaf = isLeaf;
      this.topLeft = topLeft;
      this.topRight = topRight;
      this.bottomLeft = bottomLeft;
      this.bottomRight = bottomRight;
    }
  }

  private static Node builder(int[][] grid, int size, int row, int col) {
    if (isUniform(grid, size, row, col)) {
      return leaf(grid[row][col]);
    }
    return subDivide(grid, size / 2, row, col);
  }

  private static Node subDivide(int[][] grid, int size, int row, int col) {
    return new Node(
        false,
        false,
        builder(grid, size, row, col),
        builder(grid, size, row, col + size),
        builder(grid, size, row + size, col),
        builder(grid, size, row + size, col + size));
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

  static Node build(int[][] grid) {
    return builder(grid, grid.length, 0, 0);
  }
}
