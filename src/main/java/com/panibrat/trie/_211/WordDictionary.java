package com.panibrat.trie._211;

/*
211. Add and Search Word - Data structure design

Design a data structure that supports the following two operations:

void addWord(word)
bool search(word)
search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.

Example:

addWord("bad")
addWord("dad")
addWord("mad")
search("pad") -> false
search("bad") -> true
search(".ad") -> true
search("b..") -> true

Note:
You may assume that all words are consist of lowercase letters a-z.
 */

import com.panibrat.trie.TrieNode;

class WordDictionary {
  private static final char ANY_CHAR = '.';

  private TrieNode root;

  /** Initialize your data structure here. */
  public WordDictionary() {
    root = new TrieNode();
  }

  /** Adds a word into the data structure. */
  public void addWord(String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
      if (!node.contains(c)) node.put(c, new TrieNode());
      node = node.get(c);
    }
    node.setEnd();
  }

  /**
   * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one
   * letter.
   */
  public boolean search(String word) {
    return match(root, 0, word.toCharArray());
  }

  private boolean match(TrieNode node, int i, char[] chars) {
    if (i >= chars.length) return node.isEnd();
    char c = chars[i];
    if (c == ANY_CHAR) {
      for (TrieNode child : node) {
        if (match(child, i + 1, chars)) return true;
      }
    } else {
      return node.contains(c) && match(node.get(c), i + 1, chars);
    }
    return false;
  }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */