package com.panibrat.Moving_Average_From_Data_Stream_346

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MovingAverageTest {

    @Test
    fun matchesExample() {
        val m = MovingAverage(3)
        assertThat(m.next(1)).isEqualTo(1.0)
        assertThat(m.next(10)).isEqualTo((1 + 10) / 2.0)
        assertThat(m.next(3)).isEqualTo((1 + 10 + 3) / 3.0)
        assertThat(m.next(5)).isEqualTo((10 + 3 + 5) / 3.0)
    }
}