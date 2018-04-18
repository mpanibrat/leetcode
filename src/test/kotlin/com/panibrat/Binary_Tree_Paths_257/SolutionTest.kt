package com.panibrat.Binary_Tree_Paths_257

import com.panibrat.Common.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    /*
    For example, given the following binary tree:

       1
     /   \
    2     3
     \
      5
    All root-to-leaf paths are:

    ["1->2->5", "1->3"]
     */
    @Test
    fun binaryTreePaths() {
        val n1 = TreeNode(1)
        val n2 = TreeNode(2)
        val n3 = TreeNode(3)
        val n5 = TreeNode(5)
        n1.left = n2
        n1.right = n3
        n2.right = n5

        assertThat(sol.binaryTreePaths(n1)).containsExactlyInAnyOrder("1->2->5", "1->3")
    }
}