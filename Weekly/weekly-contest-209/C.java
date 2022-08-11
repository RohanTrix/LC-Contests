// SLIDING WINDOW ON THE ANGLES FORMED BY POINTS WRT THE LOCATION. POINTS COINCIDING WITH LOCATION HAVE TO BE COUNTED SEPARATELY
class Solution {void debug(Object... o) { System.out.println(Arrays.deepToString(o));}
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        double ANGLE = Math.toRadians(angle);
        int n = points.size();
        int base = 0;
        int locx = location.get(0), locy = location.get(1);
        List<Double> thetas = new ArrayList<>();
        for(List<Integer> point : points)
        {
            int h = point.get(1) - locy;
            int b = point.get(0) - locx;
            if(h == 0 && b == 0)
                base++;
            else
                thetas.add(Math.toDegrees(Math.atan2(h, b)));
        }
        // debug(thetas);
        
        Collections.sort(thetas);
        n = thetas.size();
        for(int i = 0; i<n; i++)
            thetas.add(360 + thetas.get(i));
        
        int left = 0, maxi = 0;
        for(int right = 0; right<thetas.size(); right++)
        {
            while(left<right && thetas.get(right) - thetas.get(left) > angle)
                left++;
            maxi = Math.max(maxi, right - left + 1);
        }
        return maxi + base;
    }
}
