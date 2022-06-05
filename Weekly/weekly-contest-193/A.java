class Solution {
    public int[] runningSum(int[] nums) {
        int pref[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            if(i == 0)
            {
                pref[i] = nums[i];
                continue;
            }
            pref[i] = pref[i-1]+ nums[i];
        }
        return pref;
    }
}
