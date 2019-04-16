package com.panibrat.linked_list._206;

/*
206. Reverse Linked List

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?


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
  private ListNode reverseListRec(ListNode head) {
    if (head == null || head.getNext() == null) return head;
    ListNode node = reverseListRec(head.getNext());
    head.getNext().setNext(head);
    head.setNext(null);
    return node;
  }

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode next = curr.getNext();
      curr.setNext(prev);
      prev = curr;
      curr = next;
    }
    return prev;
  }
}
