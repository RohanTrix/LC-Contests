class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long num = 0; int n = nums.length;
        for(int i = 0; i<n/2; i++)
            num+=Integer.valueOf(""+nums[i]+nums[n-i-1]);
        if(n%2 != 0)
            num+=nums[n/2];
        return num;
    }
}
