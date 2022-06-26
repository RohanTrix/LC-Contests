class Solution {
    public boolean isPathCrossing(String path) {
        Set<Point> set = new HashSet<>();
        set.add(new Point(0,0));
        int x = 0, y = 0;
        for(char ch : path.toCharArray())
        {
            if(ch == 'N')
                y++;
            else if(ch == 'S')
                y--;
            else if(ch == 'W')
                x--;
            else if(ch == 'E')
                x++;
            if(set.contains(new Point(x,y))) return true;
            set.add(new Point(x,y));
        }
        return false;
    }
    class Point
    {
        int x, y;
        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        public boolean equals(Object pp)
        {
            Point p = (Point)pp;
            return x == p.x && y == p.y;
        }
        public int hashCode()
        {
            return Objects.hash(x,y);
        }
    }
}
