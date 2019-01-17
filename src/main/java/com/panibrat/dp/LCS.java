package com.panibrat.dp;

/* Dynamic Programming Java implementation of LCS problem */
public class LCS {

  public static void main(String[] args) {
    LCS lcs = new LCS();
    String s1 = "AGGTAB";
    String s2 = "GXTXAYB";

    System.out.println("Length of LCS is" + " " + lcs.subsequence(s1, s2));
  }

  String subsequence(String x, String y) {
    int m = x.length();
    int n = y.length();
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (x.charAt(i) == y.charAt(j)) dp[i + 1][j + 1] = dp[i][j] + 1;
        else dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
      }
    }
    StringBuilder sb = new StringBuilder();
    while (m-- > 0 && n-- > 0) {
      if (x.charAt(m) == y.charAt(n)) sb.append(x.charAt(m));
      else if (dp[m][n + 1] <= dp[m + 1][n]) m++;
      else n++;
    }
    return sb.reverse().toString();
  }
}
