package com.panibrat.codility;

/*
Strings with long blocks of repeating characters take much less space if kept in a compressed representation. To obtain the compressed representation, we replace each segment of equal characters in the string with the number of characters in the segment followed by the character (for example, we replace segment "CCCC" with "4C"). To avoid increasing the size, we leave the one-letter segments unchanged (the compressed representation of "BC" is the same string - "BC").

For example, the compressed representation of the string "ABBBCCDDCCC" is "A3B2C2D3C", and the compressed representation of the string "AAAAAAAAAAABXXAAAAAAAAAA" is "11AB2X10A".

Observe that, in second example, if we removed the "BXX" segment from the middle of the word, we would obtain a much shorter compressed representation - "21A". in order to take advantage of this observation, we decided to modify our compression algorithm. Now, before compression, we remove exactly K consecutive letters from the input string. We would like to know the shortest compressed form that we can generate this way.

Write a function that, given a string S of length N and an integer K, returns the shortest possible length of the compressed representation of S after removing exactly K consecutive characters from S.

Examples:

1. Given S = "ABBBCCDDCCC" and K = 3, the function should return 5, because after removing "DDC" from S, we are left with "ABBBCCCC", which compresses to a representation of length 5 - "A3B4C".
2. Given S = "AAAAAAAAAAABXXAAAAAAAAAA" and K = 3, the function should return 3, because after removing "BXX" from S, we are left with "AAAAAAAAAAAAAAAAAAAAA", which compresses to a representation of length 3 - "A21".
3. Given S = "ABCDDDEFG" and K = 2, the function should return 6, because after removing "EF" from S, we are left with "ABCDDDG", which compresses to a representation of length 6 - "ABC3DG".

Write an efficient algorithm for the following assumptions:
 - N is an integer with the range [1..100,000];
 - K is an integer with the range [0..100,000];
 - K <= N;
 - string S consists only of uppercase letters (A-Z).
 */
public class MinLenAfterKCharsRemoved {

  public int solution(String S, int K) {
    if (S.length() <= K) {
      return 0;
    }
    Node node = compress(S);
    if (K == 0) {
      return getTotalSize(node);
    }
    int min = Integer.MAX_VALUE;
    Node stub = new Node('#', 0);
    for (int i = 0; i + K <= S.length(); i++) {
      min = Math.min(min, modifiedSize(stub, node, i, K));
    }
    return min;
  }

  private static Node compress(String str) {
    Node head = new Node('0', 0);
    Node node = head;
    int index = 0;
    while (index < str.length()) {
      char letter = str.charAt(index++);
      int count = 1;
      while (index < str.length() && letter == str.charAt(index)) {
        count += 1;
        index += 1;
      }
      node.next = new Node(letter, count);
      node = node.next;
    }
    return head.next;
  }

  private static int modifiedSize(Node prev, Node node, int include, int remove) {
    if (node == null) {
      return 0;
    }
    if (include >= node.count) {
      return getSize(node) + modifiedSize(node, node.next, include - node.count, remove);
    }
    if (include > 0) {
      Node current = new Node(node.letter, include);
      Node next = new Node(node.letter, node.count - include, node.next);
      return getSize(current) + modifiedSize(current, next, 0, remove);
    }
    if (remove >= node.count) {
      return modifiedSize(prev, node.next, 0, remove - node.count);
    }
    if (remove > 0) {
      return modifiedSize(prev, new Node(node.letter, node.count - remove, node.next), 0, 0);
    }
    if (prev.letter == node.letter) {
      Node current = new Node(node.letter, node.count + prev.count, node.next);
      return getSize(current) - getSize(prev) + modifiedSize(current, node.next, 0, 0);
    }
    return getTotalSize(node);
  }

  private static int getTotalSize(Node node) {
    int total = 0;
    while (node != null) {
      total += getSize(node);
      node = node.next;
    }
    return total;
  }

  private static int getSize(Node node) {
    return node.count > 1 ? Integer.toString(node.count).length() + 1 : 1;
  }

  private static class Node {
    final char letter;
    final int count;
    Node next;

    Node(char letter, int count) {
      this.letter = letter;
      this.count = count;
    }

    Node(char letter, int count, Node next) {
      this.letter = letter;
      this.count = count;
      this.next = next;
    }
  }
}
