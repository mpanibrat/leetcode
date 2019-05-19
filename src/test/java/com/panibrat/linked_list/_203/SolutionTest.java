package com.panibrat.linked_list._203;

import static com.panibrat.linked_list.LinkedList.singlyLinkedList;
import static org.assertj.core.api.Assertions.assertThat;

import com.panibrat.linked_list.LinkedList.ListNode;
import org.junit.Test;

/*
203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5

 */
public class SolutionTest {

  @Test
  public void removeElements() {
    ListNode list = singlyLinkedList(1, 2, 6, 3, 4, 5, 6);
    ListNode expected = singlyLinkedList(1, 2, 3, 4, 5);
    ListNode actual = new Solution().removeElements(list, 6);
    assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
  }

  @Test
  public void removeElements_head() {
    ListNode list = singlyLinkedList(6, 1, 2, 6, 3, 4, 5, 6);
    ListNode expected = singlyLinkedList(1, 2, 3, 4, 5);
    ListNode actual = new Solution().removeElements(list, 6);
    assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
  }

  @Test
  public void removeElements_single() {
    ListNode list = singlyLinkedList(1);
    ListNode actual = new Solution().removeElements(list, 1);
    assertThat(actual).isNull();
  }

  @Test
  public void removeElements_same() {
    ListNode list = singlyLinkedList(1, 1);
    ListNode actual = new Solution().removeElements(list, 1);
    assertThat(actual).isNull();
  }
}
