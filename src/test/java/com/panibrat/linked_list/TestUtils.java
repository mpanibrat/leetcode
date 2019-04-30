package com.panibrat.linked_list;

import static org.junit.Assert.assertEquals;

public class TestUtils {

  public static void assertListEquals(ListNode a, ListNode b) {
    while (a != null && b != null) {
      assertEquals(a.val, b.val);
      a = a.next;
      b = b.next;
    }
    assertEquals(a, b);
  }

  public static ListNode singlyLinkedList(int... values) {
    ListNode stub = new ListNode(0);
    ListNode node = stub;
    for (int value : values) {
      node.next = new ListNode(value);
      node = node.next;
    }
    return stub.next;
  }

}
