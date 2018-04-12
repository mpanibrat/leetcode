package com.panibrat.Logger_Rate_Limiter_359

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoggerTest {

    @Test
    fun shouldPrintMessage() {
        val logger = Logger()

        // logging string "foo" at timestamp 1
        assertThat(logger.shouldPrintMessage(1, "foo")).isEqualTo(true)

        // logging string "bar" at timestamp 2
        assertThat(logger.shouldPrintMessage(2, "bar")).isEqualTo(true)

        // logging string "foo" at timestamp 3
        assertThat(logger.shouldPrintMessage(3, "foo")).isEqualTo(false)

        // logging string "bar" at timestamp 8
        assertThat(logger.shouldPrintMessage(8, "bar")).isEqualTo(false)

        // logging string "foo" at timestamp 10
        assertThat(logger.shouldPrintMessage(10, "foo")).isEqualTo(false)

        // logging string "foo" at timestamp 11
        assertThat(logger.shouldPrintMessage(11, "foo")).isEqualTo(true)
    }
}