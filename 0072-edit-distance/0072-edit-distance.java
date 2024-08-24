class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Initialize dp array
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // Cost of deleting all characters from word1 to match empty word2
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // Cost of inserting all characters into empty word1 to match word2
        }

        // Fill the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int row = dp[i][j - 1] + 1; // Cost of insertion
                    int col = dp[i - 1][j] + 1; // Cost of deletion
                    int diag = dp[i - 1][j - 1] + 1; // Cost of replacement

                    dp[i][j] = Math.min(Math.min(row, col), diag);
                }
            }
        }

        // The answer is the cost to convert word1 to word2
        return dp[m][n];
    }
}
