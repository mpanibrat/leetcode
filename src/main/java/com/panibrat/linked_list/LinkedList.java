package com.panibrat.linked_list;

public interface LinkedList {

  static ListNode singlyLinkedList(int... values) {
    ListNode stub = new ListNode(0);
    ListNode node = stub;
    for (int value : values) {
      node.next = new ListNode(value);
      node = node.next;
    }
    return stub.next;
  }

  class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
