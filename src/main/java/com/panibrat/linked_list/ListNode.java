package com.panibrat.linked_list;

public class ListNode {
  private int val;
  private ListNode next;

  public ListNode(int x) {
    setVal(x);
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  public ListNode getNext() {
    return next;
  }

  public void setNext(ListNode next) {
    this.next = next;
  }
}
