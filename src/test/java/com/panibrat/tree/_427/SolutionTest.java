package com.panibrat.tree._427;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.panibrat.tree.QuadTree.Node;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void construct() {
    int[][] grid = new int[][] {{1}};
    Node node = new Solution().construct(grid);
    assertTrue(node.isLeaf);
    assertTrue(node.val);
    assertNull(node.topLeft);
    assertNull(node.topRight);
    assertNull(node.bottomLeft);
    assertNull(node.bottomRight);
  }

  @Test
  public void construct_4() {
    int[][] grid = new int[][] {{1, 1}, {1, 0}};
    Node node = new Solution().construct(grid);
    assertFalse(node.isLeaf);
    assertTrue(node.topLeft.isLeaf);
    assertTrue(node.topLeft.val);
    assertTrue(node.topRight.isLeaf);
    assertTrue(node.topRight.val);
    assertTrue(node.bottomLeft.isLeaf);
    assertTrue(node.bottomLeft.val);
    assertTrue(node.bottomRight.isLeaf);
    assertFalse(node.bottomRight.val);
  }
}
