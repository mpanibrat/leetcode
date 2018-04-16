package com.panibrat.Minimum_Absolute_Difference_in_BST_530

import com.panibrat.Common.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun getMinimumDifference() {
        val s = Solution()
        val n1 = TreeNode(1)
        val n2 = TreeNode(2)
        val n3 = TreeNode(3)

        n1.right = n3
        n3.left = n2

        assertThat(s.getMinimumDifference(n1)).isEqualTo(1)
    }
}