public int[] circularGameLosers(int n, int k) {
        int p = 0, j = 1;
        Set<Integer> set = new HashSet<>();
        while(!set.contains(p)) {
            set.add(p);
            p = (p + (j*k))%n;
            j++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++)
            if(!set.contains(i))
                list.add(i+1);
        int ans[] = new int[list.size()];
        for(int i = 0; i<ans.length; i++)
            ans[i] = list.get(i);
        return ans;
    }
