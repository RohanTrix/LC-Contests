class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
        // O(N) DP Solution
        // evenodd[] stores sum of prefix sums of previous even indexes and odd indexes
        int n = nums.length;
        int pref[] = new int[n+1];
        for(int i = 1; i<=n; i++) pref[i] = pref[i-1]+nums[i-1];
        int fullSum = 0;
        
        int evenodd[] = {0,0};
        for(int i = 1; i<=n; i++)
        {
            int a = pref[i]*((i+1)/2);
            int b = evenodd[(i-1)%2];
            evenodd[i%2]+=pref[i];
            fullSum += a-b;
        }
        return fullSum;
    }
}

// O(n^2) logic is easy to come up with so code not added
