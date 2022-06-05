class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++)
        {
            int j = i;
            while(j<n && nums[j] - nums[i] <=k) j++;
            i = j-1;
            cnt++;
        }
        return cnt;
    }
}
