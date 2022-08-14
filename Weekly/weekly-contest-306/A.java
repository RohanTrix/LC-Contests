class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int ans[][] = new int[n-2][n-2];
        
        for(int x1 = 0; x1<n; x1++)
            for(int y1 = 0; y1<n; y1++)
            {
                int x2 = x1+2, y2 = y1+2;
                if(x2>=n || y2>=n) continue;
                int maxi = Integer.MIN_VALUE;
                for(int i  = x1; i<=x2; i++)
                    for(int j = y1; j<=y2; j++)
                        maxi = Math.max(maxi, grid[i][j]);
                ans[x1][y1] = maxi;
            }
        return ans;
    }
}
