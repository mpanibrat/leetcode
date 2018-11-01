package com.panibrat.trie;

public class TrieNode {
  private static final int ALPHABET_SIZE = 26;

  private TrieNode[] links;
  private boolean isEnd;

  public TrieNode() {
    links = new TrieNode[ALPHABET_SIZE];
  }

  public TrieNode get(char c) {
    return links[c - 'a'];
  }

  public boolean contains(char c) {
    return get(c) != null;
  }

  public void put(char c, TrieNode node) {
    links[c - 'a'] = node;
  }

  public boolean isEnd() {
    return isEnd;
  }

  public void setEnd() {
    isEnd = true;
  }
}
