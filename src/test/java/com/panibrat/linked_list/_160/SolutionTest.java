package com.panibrat.linked_list._160;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.panibrat.linked_list.ListNode;
import org.junit.Test;

/*
160. Intersection of Two Linked Lists

Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:


begin to intersect at node c1.



Example 1:


Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.


Example 2:


Input: intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Reference of the node with value = 2
Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [0,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.


Example 3:


Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: null
Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.

 */
public class SolutionTest {

  @Test
  public void getIntersectionNode_ex1() {
    ListNode n0 = new ListNode(4);
    ListNode n1 = new ListNode(1);

    ListNode n2 = new ListNode(8);
    ListNode n3 = new ListNode(4);
    ListNode n4 = new ListNode(5);

    ListNode n5 = new ListNode(5);
    ListNode n6 = new ListNode(0);
    ListNode n7 = new ListNode(1);

    n0.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n5.next = n6;
    n6.next = n7;
    n7.next = n2;

    assertEquals(new Solution().getIntersectionNode(n0, n5), n2);
  }

  @Test
  public void getIntersectionNode_ex2() {
    ListNode n0 = new ListNode(0);
    ListNode n1 = new ListNode(9);
    ListNode n2 = new ListNode(1);

    ListNode n3 = new ListNode(2);
    ListNode n4 = new ListNode(4);

    ListNode n5 = new ListNode(3);

    n0.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n5.next = n3;

    assertEquals(new Solution().getIntersectionNode(n0, n5), n3);
  }

  @Test
  public void getIntersectionNode_ex3() {
    ListNode n0 = new ListNode(2);
    ListNode n1 = new ListNode(6);
    ListNode n2 = new ListNode(4);

    ListNode n3 = new ListNode(1);
    ListNode n4 = new ListNode(5);

    n0.next = n1;
    n1.next = n2;

    n3.next = n4;

    assertNull(new Solution().getIntersectionNode(n0, n3));
  }
}