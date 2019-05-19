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

import com.panibrat.linked_list.LinkedList.ListNode;

/**
 * Definition for singly-linked list.
 *
 * <pre>{@code
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * }</pre>
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode curr = dummy.next;
    while (n-- > 0) {
      curr = curr.next;
    }
    while (curr != null) {
      curr = curr.next;
      prev = prev.next;
    }
    prev.next = prev.next.next;
    return dummy.next;
  }
}
