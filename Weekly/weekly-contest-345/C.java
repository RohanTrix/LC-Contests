class Solution {
    public int maxMoves(int[][] grid) {
        int maxCol = 0;
        int m = grid.length, n = grid[0].length;
        boolean dp[][] = new boolean[m][n];
        for(int i = 0; i<m; i++) dp[i][0] = true;
        for(int j = 1; j<n; j++) {
            for(int i = 0; i<m; i++) {
                boolean ans = false;
                int currVal = grid[i][j];
                if(i-1>=0 && currVal > grid[i-1][j-1]) ans|=dp[i-1][j-1];
                if(i+1<m && currVal > grid[i+1][j-1]) ans|= dp[i+1][j-1];
                if(currVal > grid[i][j-1]) ans|= dp[i][j-1];
                dp[i][j] = ans;
                if(ans) maxCol = j;
            }
        }
        return maxCol;
    }
}
