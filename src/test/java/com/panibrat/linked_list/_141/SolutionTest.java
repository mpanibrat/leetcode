package com.panibrat.linked_list._141;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.panibrat.linked_list.ListNode;
import org.junit.Test;

/*
141. Linked List Cycle

Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.



Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.


Example 2:

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.


Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.




Follow up:

Can you solve it using O(1) (i.e. constant) memory?

*/
public class SolutionTest {

  @Test
  public void hasCycle_ex1() {
    ListNode n0 = new ListNode(3);
    ListNode n1 = new ListNode(2);
    ListNode n2 = new ListNode(0);
    ListNode n3 = new ListNode(-4);
    n0.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n1;
    assertTrue(new Solution().hasCycle(n0));
  }

  @Test
  public void hasCycle_ex2() {
    ListNode n0 = new ListNode(1);
    ListNode n1 = new ListNode(2);
    n0.next = n1;
    n1.next = n0;
    assertTrue(new Solution().hasCycle(n0));
  }

  @Test
  public void hasCycle_ex3() {
    ListNode n0 = new ListNode(1);
    assertFalse(new Solution().hasCycle(n0));
  }

  @Test
  public void hasCycle_null() {
    assertFalse(new Solution().hasCycle(null));
  }

  @Test
  public void hasCycle_self() {
    ListNode n0 = new ListNode(1);
    n0.next = n0;
    assertTrue(new Solution().hasCycle(n0));
  }
}
