package com.panibrat.linked_list._21;

/*
21. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
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
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);
    ListNode prev = head;
    while (l1 != null && l2 != null) {
      if (l1.getVal() < l2.getVal()) {
        prev.setNext(l1);
        l1 = l1.getNext();
      } else {
        prev.setNext(l2);
        l2 = l2.getNext();
      }
      prev = prev.getNext();
    }
    prev.setNext(l1 == null ? l2 : l1);
    return head.getNext();
  }
}
