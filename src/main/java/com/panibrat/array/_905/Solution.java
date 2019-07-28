package com.panibrat.array._905;

/*
905. Sort Array By Parity

Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.



Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000

 */
class Solution {
  public int[] sortArrayByParity(int[] array) {
    int left = 0;
    int right = array.length - 1;
    while (left < right) {
      if (isEven(array, left)) {
        left += 1;
      } else if (!isEven(array, right)) {
        right -= 1;
      } else {
        swap(array, left, right);
        left += 1;
        right -= 1;
      }
    }
    return array;
  }

  private static boolean isEven(int[] array, int index) {
    return array[index] % 2 == 0;
  }

  private static void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }
}
