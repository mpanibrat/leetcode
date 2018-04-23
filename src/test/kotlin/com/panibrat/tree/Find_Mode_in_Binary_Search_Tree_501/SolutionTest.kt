package com.panibrat.tree.Find_Mode_in_Binary_Search_Tree_501

import com.panibrat.tree.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun findMode() {
        val n1 = TreeNode(1)
        val n2 = TreeNode(2)
        val n3 = TreeNode(2)
        val n4 = TreeNode(3)
        val n5 = TreeNode(3)

        n1.right = n2
        n2.left = n3
        n2.right = n4
        n4.right = n5

        assertThat(sol.findMode(n1)).containsExactlyInAnyOrder(2, 3)
    }
}