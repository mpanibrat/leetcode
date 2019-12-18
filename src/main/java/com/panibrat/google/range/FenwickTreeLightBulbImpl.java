package com.panibrat.google.range;

public class FenwickTreeLightBulbImpl implements LightBulb {

  final int[] sum;

  FenwickTreeLightBulbImpl(int size) {
    sum = new int[size];
  }

  // sum from 1 to index
  private int read(int index) {
    int value = 0;
    while (index > 0) {
      value += sum[index];
      index -= leastSignificantBit(index);
    }
    return value;
  }

  private void update(int index, int value) {
    while (index < sum.length) {
      sum[index] += value;
      index += leastSignificantBit(index);
    }
  }

  private int leastSignificantBit(int n) {
    return n & -n;
  }

  @Override
  public boolean isOn(int index) {
    return read(index) % 2 == 1;
  }

  @Override
  public void toggle(int start, int end) {
    update(start, 1);
    update(end + 1, -1);
  }
}
