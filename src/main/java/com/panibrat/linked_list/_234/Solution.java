package com.panibrat.linked_list._234;

import com.panibrat.linked_list.ListNode;
import java.util.Deque;
import java.util.LinkedList;

/*
234. Palindrome Linked List

Given a singly linked list, determine if it is a palindrome.

Example 1:
Input: 1->2
Output: false

Example 2:
Input: 1->2->2->1
Output: true

Follow up:
Could you do it in O(n) time and O(1) space?
 */
class Solution {

  public boolean isPalindrome(ListNode head) {
    Deque<Integer> stack = new LinkedList<>();
    for (ListNode node = head; node != null; node = node.next) {
      stack.push(node.val);
    }
    for (ListNode node = head; node != null; node = node.next) {
      if (stack.pop() != node.val) {
        return false;
      }
    }
    return true;
  }
}