package com.panibrat.trie._208;

import com.panibrat.trie.TrieNode;

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

/**
 * Your Trie object will be instantiated and called as such:
 *
 * <pre>{@code
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 * }</pre>
 */
public class Trie {
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
