package com.panibrat.tree.Diameter_of_Binary_Tree_543

import com.panibrat.tree.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()
    /*
    Given a binary tree
              1
             / \
            2   3
           / \
          4   5
    Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
     */
    @Test
    fun diameterOfBinaryTree() {
        val n1 = TreeNode(1)
        val n2 = TreeNode(2)
        val n3 = TreeNode(3)
        val n4 = TreeNode(4)
        val n5 = TreeNode(5)

        n1.left = n2
        n1.right = n3
        n2.left = n4
        n2.right = n5

        assertThat(s.diameterOfBinaryTree(n1)).isEqualTo(3)
    }

    @Test
    fun diameterOfSingleNode() {
        val n1 = TreeNode(1)
        assertThat(s.diameterOfBinaryTree(n1)).isEqualTo(0)
    }
}