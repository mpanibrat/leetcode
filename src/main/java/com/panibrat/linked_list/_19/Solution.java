package com.panibrat.linked_list._19;

/*
19. Remove Nth Node From End of List

Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?

 */

import com.panibrat.linked_list.ListNode;

/**
 * Definition for singly-linked list.
 * <pre>
 * {@code
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * }
 * </pre>
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.setNext(head);
    ListNode prev = dummy;
    ListNode curr = dummy.getNext();
    while (n-- > 0) {
      curr = curr.getNext();
    }
    while (curr != null) {
      curr = curr.getNext();
      prev = prev.getNext();
    }
    prev.setNext(prev.getNext().getNext());
    return dummy.getNext();
  }
}
