package com.panibrat.tree._307;

/**
 * Your NumArray object will be instantiated and called as such:
 *
 * <pre>
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 * </pre>
 */
public interface NumArray {

  void update(int i, int val);

  int sumRange(int i, int j);
}
