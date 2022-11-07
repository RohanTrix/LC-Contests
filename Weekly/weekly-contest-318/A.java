class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i =0; i<n-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums[i]*=2;
                nums[i+1] = 0;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums)
            if(num!=0)
                list.add(num);
        for(int i = 0; i<list.size(); i++)
            nums[i] = list.get(i);
        for(int i = list.size(); i<n; i++)
            nums[i] = 0;
        return nums;
    }
}
