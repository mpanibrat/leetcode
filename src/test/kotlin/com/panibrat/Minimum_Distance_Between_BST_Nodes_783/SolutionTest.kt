package com.panibrat.Minimum_Distance_Between_BST_Nodes_783

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/*
          4
        /   \
      2      6
     / \
    1   3

 */
internal class SolutionTest {

    val s = Solution()

    @Test
    fun minDiffInBST() {
        val n1 = TreeNode(1)
        val n2 = TreeNode(2)
        val n3 = TreeNode(3)
        val n4 = TreeNode(4)
        val n6 = TreeNode(6)

        n4.left = n2
        n4.right = n6
        n2.left = n1
        n2.right = n3

        assertThat(s.minDiffInBST(n4)).isEqualTo(1)
    }

    @Test
    fun minDiffInBST_Stack() {
        val n1 = TreeNode(1)
        val n2 = TreeNode(2)
        val n3 = TreeNode(3)
        val n4 = TreeNode(4)
        val n6 = TreeNode(6)

        n4.left = n2
        n4.right = n6
        n2.left = n1
        n2.right = n3

        assertThat(s.minDiffInBST_Stack(n4)).isEqualTo(1)
    }
}