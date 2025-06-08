package org.bosscoder;

public class LongestCommonSequence {

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";

        int lcsLength = longestCommonSubsequence(str1, str2);

        System.out.println("Length of LCS is: " + lcsLength);

        int m = str1.length();
        int n = str2.length();

        int lcsLength2 = longestCommonSubsequenceRes(str1, str2, m, n);

        System.out.println("Length of LCS is: " + lcsLength2);

    }

    private static int longestCommonSubsequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }


    private static int longestCommonSubsequenceRes(String str1, String str2, int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        }
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return longestCommonSubsequenceRes(str1, str2, m-1, n-1) + 1;
        } else {
            return Math.max(longestCommonSubsequenceRes(str1, str2, m - 1, n), longestCommonSubsequenceRes(str1, str2, m, n - 1));
        }
    }
}
