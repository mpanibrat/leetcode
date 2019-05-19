package com.panibrat.linked_list._203;

import com.panibrat.linked_list.LinkedList.ListNode;

/*
203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5

0->1->1
 */
class Solution {

  public ListNode removeElementsIterative(ListNode head, int val) {
    ListNode stub = new ListNode(0);
    stub.next = head;
    ListNode prev = stub;
    ListNode curr = head;
    while (curr != null) {
      if (curr.val == val) {
        prev.next = curr.next;
      } else {
        prev = prev.next;
      }
      curr = curr.next;
    }
    return stub.next;
  }

  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return null;
    }
    if (head.val == val) {
      return removeElements(head.next, val);
    }
    head.next = removeElements(head.next, val);
    return head;
  }
}
