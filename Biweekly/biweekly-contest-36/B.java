class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        TreeMap<String, List<Integer>> map = new TreeMap<>();
        // TreeSet<String> set = new TreeSet<>();
        int n = keyName.length;
        for(int i = 0; i<n; i++)
        {
            int time = Integer.valueOf(keyTime[i].substring(0,2))*60 + Integer.valueOf(keyTime[i].substring(3));
            map.computeIfAbsent(keyName[i], k-> new ArrayList<>()).add(time);
        }
        List<String> ans = new ArrayList<>();
        for(String name : map.keySet())
        {
            List<Integer> tmp = map.get(name);
            Collections.sort(tmp);
            int i = 2;
            while(i<tmp.size())
            {
                if(tmp.get(i) - tmp.get(i-2)<=60)
                {
                    ans.add(name);
                    break;
                }
                i++;
            }
        }
        return ans;
    }
}
