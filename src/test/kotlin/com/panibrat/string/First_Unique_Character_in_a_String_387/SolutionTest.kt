package com.panibrat.string.First_Unique_Character_in_a_String_387

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun firstUniqCharExample1() {
        val str = "leetcode"
        assertThat(s.firstUniqChar(str)).isEqualTo(0)
    }

    @Test
    fun firstUniqCharExample2() {
        val str = "loveleetcode"
        assertThat(s.firstUniqChar(str)).isEqualTo(2)
    }
}