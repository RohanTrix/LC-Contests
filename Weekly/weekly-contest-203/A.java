class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int first = rounds[0], last = rounds[rounds.length-1];
        // Brain Teaser : There may be many complete cycles in this track. The only incomplete cycle will be between first and last
        List<Integer> list = new ArrayList<>();
        if(first <= last)
        {
            for(int i = first; i<=last; i++)
                list.add(i);
        }
        else
        {
            for(int i = 1; i<=last; i++)
                list.add(i);
            for(int i = first; i<=n; i++)
                list.add(i);
        }
        return list;
    }
}
