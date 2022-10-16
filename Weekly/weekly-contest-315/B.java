class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
            set.add(Integer.valueOf(new StringBuilder(""+num).reverse().toString()));
        }
        return set.size();
    }
}

