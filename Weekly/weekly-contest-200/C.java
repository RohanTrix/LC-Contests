class Solution {
    public int minSwaps(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int trail[] = new int[m];
        for(int i = 0; i<m; i++)
        {
            for(int j = n-1; j>=0;j--)
            {
                if(grid[i][j] == 0)
                    trail[i]++;
                else break;
            }
        }
        int cnt = 0;
        int req = m-1;
        for(int i = 0; i<m; i++)
        {
            int j = i;
            while(j<n && trail[j]<req) j++;
            if(j == n) return -1;
            while(j>i)
            {
                int tmp = trail[j];
                trail[j] = trail[j-1];
                trail[j-1] = tmp;
                cnt++;
                j--;
            }
            req--;
        }
        return cnt;
    }
}
