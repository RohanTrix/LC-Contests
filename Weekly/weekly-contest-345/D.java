class Solution {
    class DSU {
        int parent[], rank[];
        public DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            Arrays.fill(parent, -1);
            Arrays.fill(rank, 1);
        }
        public int find(int u) {
            if(parent[u] == -1) return u;
            return parent[u] = find(parent[u]);
        }
        public void union(int a, int b) {
            int s1 = find(a);
            int s2 = find(b);
            if(s1!=s2) {
                if(rank[s1] > rank[s2]) {
                    rank[s1]+=rank[s2];
                    parent[s2] = s1;
                }
                else{
                    rank[s2]+=rank[s1];
                    parent[s1] = s2;
                }
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        DSU d = new DSU(n);
        int indeg[] = new int[n];
        for(int edge[] : edges) {
            d.union(edge[0], edge[1]);
            indeg[edge[0]]++;
            indeg[edge[1]]++;
        }
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i<n; i++) {
            int leader = d.find(i);
            map.computeIfAbsent(leader, k-> new ArrayList<>()).add(i);
        }
        int cnt = 0;
        for(int key : map.keySet()) {
            boolean ans = true; 
            for(int node : map.get(key))
                ans = ans && (indeg[node] == (d.rank[d.find(node)] - 1));
            if(ans)cnt++;
        }
        return cnt;
        
    }
}
