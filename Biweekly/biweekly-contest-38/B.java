class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> a[0] - b[0]);
        int maxi = 0;
        
        for(int i = 1; i<points.length; i++)
        {
            int p2[] = points[i], p1[] = points[i-1];
            maxi = Math.max(maxi, p2[0] - p1[0]);
        }
        return maxi;
    }
}
