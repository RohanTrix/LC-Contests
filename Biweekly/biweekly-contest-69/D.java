class Solution {
    public boolean possibleToStamp(int[][] grid, int stampHeight, int stampWidth) {
        int m = grid.length, n = grid[0].length;
        int pref[][] = new int[m+1][n+1];
        //PREFIX SUM
        for(int i =1; i<=m; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                pref[i][j] = grid[i-1][j-1] + pref[i-1][j] + pref[i][j-1] - pref[i-1][j-1];
            }
        }
        //view2D(pref);
        int marker[][] = new int[m+2][n+2];
        for(int i =1; i<=m; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                int ni = i+stampHeight-1;
                int nj = j+stampWidth-1;
                if(ni>m||nj>n) continue;
                
                int val = pref[ni][nj] - pref[i-1][nj] - pref[ni][j-1] + pref[i-1][j-1];
                if(val>0) continue;
                
                marker[i][j]++;
                marker[ni+1][nj+1]++;
                marker[ni+1][j]--;
                marker[i][nj+1]--;
            }
        }
        //view2D(marker);
        for(int i =1; i<=m; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                marker[i][j] += marker[i-1][j] + marker[i][j-1] - marker[i-1][j-1];
                
                if(grid[i-1][j-1]==1) continue;
                if(marker[i][j]==0) return false;
            }
        }
        return true;z
    }
    void view2D(int arr[][])
    {
        for(int a[]: arr) System.out.println(Arrays.toString(a));
    }
}