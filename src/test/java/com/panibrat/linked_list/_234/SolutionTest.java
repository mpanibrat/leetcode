package com.panibrat.linked_list._234;

import static com.panibrat.linked_list.TestUtils.singlyLinkedList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.panibrat.linked_list.ListNode;
import org.junit.Test;

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
public class SolutionTest {

  @Test
  public void isPalindrome_1() {
    ListNode list = singlyLinkedList(1, 2);
    assertFalse(new Solution().isPalindrome(list));
  }

  @Test
  public void isPalindrome_2() {
    ListNode list = singlyLinkedList(1, 2, 2, 1);
    assertTrue(new Solution().isPalindrome(list));
  }
}