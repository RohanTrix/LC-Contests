class Solution {
    public boolean checkValid(int[][] mat) {
        int n = mat.length;
        for(int i =0; i<n; i++)
        {
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = 0;j<n; j++)
            {
                map.put(mat[i][j], map.getOrDefault(mat[i][j], 0)+1);
                map.put(mat[j][i], map.getOrDefault(mat[j][i], 0)-1);
            }
            if(map.size()!=n) return false;
            for(int val: map.values()) if(val!=0) return false;
            
        }
        return true;
    }
}
