package com.panibrat.queue._346;

/*
346. Moving Average from Data Stream

Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Example:

MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
 */
class MovingAverage {
  private double sum = 0;
  private int index = 0;
  private int total = 0;
  private int size;
  private int[] array;

  /** Initialize your data structure here. */
  public MovingAverage(int size) {
    this.size = size;
    array = new int[size];
  }

  public double next(int val) {
    if (total < size) {
      total++;
    } else {
      sum -= array[index];
    }
    array[index] = val;
    sum += val;
    index = (index + 1) % size;
    return sum / total;
  }
}

/**
 * Your MovingAverage object will be instantiated and called as such: MovingAverage obj = new
 * MovingAverage(size); double param_1 = obj.next(val);
 */
