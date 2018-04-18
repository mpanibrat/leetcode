package com.panibrat.design.Moving_Average_From_Data_Stream_346

/*
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

For example,

MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
 */
class MovingAverage(private val size: Int) {

    /** Initialize your data structure here. */
    private val window = IntArray(size)
    private var sum = 0.0
    private var currentSize = 0

    fun next(value: Int): Double {
        val index = currentSize++ % size
        sum += value - window[index]
        window[index] = value
        return sum / Math.min(currentSize, size)
    }

}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * var obj = MovingAverage(size)
 * var param_1 = obj.next(`val`)
 */