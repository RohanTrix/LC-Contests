class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int extra) {
        List<Integer> list = new ArrayList<>();
        int n = rocks.length;
        for(int i = 0; i<n; i++)
        {
            list.add(capacity[i] - rocks[i]);
        }
        Collections.sort(list);
        int cnt = 0;
        for(int diff : list)
        {
            if(diff<=extra)
            {
                extra-=diff;
                cnt++;
            }
            
        }
        return cnt;
    }
}
