class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Frequency map of even elements
        for(int num : nums)
            if(num%2 == 0)
                map.put(num, map.getOrDefault(num, 0)+1);
        
        int maxcnt = -1;
        int ans = -1;
        for(int key : map.keySet())
            if(maxcnt <= map.get(key))
            {
                if(maxcnt == map.get(key))
                    ans = Math.min(ans, key);
                else
                {
                    ans = key;
                    maxcnt = map.get(key); 
                }
            }
        return ans;
        
    }
}
