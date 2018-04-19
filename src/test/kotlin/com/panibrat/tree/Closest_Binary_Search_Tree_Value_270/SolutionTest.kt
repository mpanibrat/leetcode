package com.panibrat.tree.Closest_Binary_Search_Tree_Value_270

import com.panibrat.tree.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun closestValue() {
        val n1 = TreeNode(1)
        val n2 = TreeNode(2)
        val n3 = TreeNode(3)
        val n4 = TreeNode(4)

        n2.left = n1
        n2.right = n3
        n3.right = n4

        assertThat(sol.closestValue(n2, 2.3)).isEqualTo(2)
        assertThat(sol.closestValue(n2, 2.51)).isEqualTo(3)
    }
}