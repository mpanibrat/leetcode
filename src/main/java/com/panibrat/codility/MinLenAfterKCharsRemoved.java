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
    char[] str = S.toCharArray();
    if (K == 0) {
      return compress(str);
    }
    int min = Integer.MAX_VALUE;
    char[] array = new char[str.length - K];
    for (int i = 0; i + K < str.length; i++) {
      copyArray(str, array, i, i + K);
      min = Math.min(min, compress(array));
    }
    return min;
  }

  void copyArray(char[] src, char[] dst, int excludeStart, int excludeEnd) {
    for (int i = 0, j = 0; i < src.length && j < dst.length; i++, j++) {
      while (i >= excludeStart && i < excludeEnd) ++i;
      dst[j] = src[i];
    }
  }

  private int compress(char[] array) {
    int size = 0;
    int count = 1;
    for (int i = 1; i < array.length; i++) {
      if (array[i] == array[i - 1]) {
        count += 1;
      } else {
        size += 1 + (count > 1 ? Integer.toString(count).length() : 0);
        count = 1;
      }
    }
    return size + 1 + (count > 1 ? Integer.toString(count).length() : 0);
  }
}
