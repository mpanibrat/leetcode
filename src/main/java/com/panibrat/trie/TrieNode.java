package com.panibrat.trie;

import java.util.Iterator;

public class TrieNode implements Iterable<TrieNode> {
  private static final int ALPHABET_SIZE = 26;

  private TrieNode[] children;
  private boolean isEnd;

  public TrieNode() {
    children = new TrieNode[ALPHABET_SIZE];
  }

  public TrieNode get(char c) {
    return children[c - 'a'];
  }

  public boolean contains(char c) {
    return get(c) != null;
  }

  public void put(char c, TrieNode node) {
    children[c - 'a'] = node;
  }

  public boolean isEnd() {
    return isEnd;
  }

  public void setEnd() {
    isEnd = true;
  }

  @Override
  public Iterator<TrieNode> iterator() {
    return new Iterator<TrieNode>() {

      int index = 0;

      @Override
      public boolean hasNext() {
        while (index < children.length) {
          if (children[index] != null) return true;
          index++;
        }
        return false;
      }

      @Override
      public TrieNode next() {
        return children[index++];
      }
    };
  }
}
