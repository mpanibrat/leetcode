package com.panibrat.trie._208;

/*
208. Implement Trie (Prefix Tree)

Implement a trie with insert, search, and startsWith methods.

Example:

Trie trie = new Trie();

trie.insert("apple");
trie.search("apple");   // returns true
trie.search("app");     // returns false
trie.startsWith("app"); // returns true
trie.insert("app");
trie.search("app");     // returns true
Note:

You may assume that all inputs are consist of lowercase letters a-z.
All inputs are guaranteed to be non-empty strings.

 */

class TrieNode {
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

class Trie {
  private TrieNode root;

  /** Initialize your data structure here. */
  public Trie() {
    root = new TrieNode();
  }

  /** Inserts a word into the trie. */
  public void insert(String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
      if (!node.contains(c)) node.put(c, new TrieNode());
      node = node.get(c);
    }
    node.setEnd();
  }

  private TrieNode searchPrefix(String prefix) {
    TrieNode node = root;
    for (char c : prefix.toCharArray()) {
      if (!node.contains(c)) return null;
      node = node.get(c);
    }
    return node;
  }

  /** Returns if the word is in the trie. */
  public boolean search(String word) {
    TrieNode node = searchPrefix(word);
    return node != null && node.isEnd();
  }

  /** Returns if there is any word in the trie that starts with the given prefix. */
  public boolean startsWith(String prefix) {
    return searchPrefix(prefix) != null;
  }
}


/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */