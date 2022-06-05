class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            tm.put(nums[i], i);
        }
        for(int op[] : operations)
        {
            int ind = tm.get(op[0]);
            tm.remove(op[0]);
            tm.put(op[1], ind);
        }
        int ans[] = new int[nums.length];
        for(int k : tm.keySet())
            ans[tm.get(k)] = k;
        return ans;
    }
    
}
