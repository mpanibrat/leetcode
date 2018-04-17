package com.panibrat.Binary_Watch_401

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val s = Solution()

    @Test
    fun readBinaryWatch() {
        assertThat(s.readBinaryWatch(1)).containsExactlyInAnyOrder(
                "1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"
        )
    }
}