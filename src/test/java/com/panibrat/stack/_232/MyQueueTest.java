package com.panibrat.stack._232;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
232. Implement Queue using Stacks

Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.

Example:

MyQueue queue = new MyQueue();

queue.push(1);
queue.push(2);
queue.peek();  // returns 1
queue.pop();   // returns 1
queue.empty(); // returns false

Notes:

* You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
* Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
* You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

*/
public class MyQueueTest {

  @Test
  public void testQueue() {
    MyQueue queue = new MyQueue();
    assertTrue(queue.empty());
    queue.push(1);
    assertFalse(queue.empty());
    queue.push(2);
    assertEquals(1, queue.peek());
    assertEquals(1, queue.pop());
    assertFalse(queue.empty());
    assertEquals(2, queue.peek());
  }
}
