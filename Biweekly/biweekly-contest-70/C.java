class Solution {
    int dr[] = {1,-1,0,0};
    int dc[] = {0,0,-1,1};
    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        int m = grid.length, n = grid[0].length;
        Queue<pair> q = new ArrayDeque<>();
        pair st = new pair(start[0], start[1], 0);
        q.offer(st);
        PriorityQueue<pair> pq = new PriorityQueue<pair>((b,a) ->
                                                     {
                                                         if( a.dist != b.dist) return a.dist - b.dist;
            if( grid[a.x][a.y] != grid[b.x][b.y]) return grid[a.x][a.y] - grid[b.x][b.y];
            return a.x!=b.x?a.x - b.x:a.y - b.y;
                                                     });
        
        boolean vis[][] = new boolean[m][n]; for(boolean a[]: vis)Arrays.fill(a, false);
        
        for(int i =0; i<m; i++) for (int j = 0; j<n; j++) vis[i][j] = grid[i][j]==0?true:false;
        vis[start[0]][start[1]] = true;
        
        while(!q.isEmpty())
        {
            pair tmp = q.poll();
            // System.out.println(tmp);
            
            
            // System.out.println(pq);
            for(int i = 0; i<4; i++)
            {
                int nx = tmp.x+dr[i], ny = tmp.y+dc[i];
                if(nx>=m|| nx<0|| ny>=n || ny<0 || vis[nx][ny]==true) continue;
                if(grid[nx][ny]==0) continue;
                vis[nx][ny]=true;
                pair npair = new pair(nx, ny, tmp.dist+1);
                q.offer(npair);
                
            }
            int val = grid[tmp.x][tmp.y];
            if(val>=2 && pricing[0]<=val && val<= pricing[1])
                pq.offer(tmp);
            if(pq.size()>k) pq.poll();
        }
        List<List<Integer>> res = new ArrayList<>();
        while(!pq.isEmpty())
        {
            pair p = pq.poll();
            List<Integer> al = new ArrayList<>(); al.add(p.x); al.add(p.y);
            res.add(0,al);
        }
        return res;
        
        
    }
    static class pair
    {
        int x;
        int y;
        int dist;
        pair(int x, int y, int dist) {
            
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
        public String toString()
        {
            return x+" "+y;
        }
    }
}
