class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        long prefPow[] = new long[n+2]; //
        prefPow[0] = 0; prefPow[1] = 1;
        long twopow = 1, mod = (int)1e9+7;
        for(int i = 2; i<=n+1; i++)
        {
            twopow<<=1;
            twopow%=mod;
            prefPow[i] = prefPow[i-1] + twopow;
            prefPow[i]%=mod;
            
        }
        // System.out.println(Arrays.toString(prefPow));
        long cnt = 0;
        for(int i = 0; i<n; i++)
        {
            int left = 0, right = i;
            int ind = -1;
            while(left<=right)
            {
                int mid = left+(right - left)/2;
                if(nums[mid]<=target-nums[i])
                {
                    ind = mid;
                    left = mid + 1;
                }
                else
                    right = mid - 1;
            }
            System.out.println(ind+" "+i);
            if(ind == -1) continue;
            int min_choices = Math.max(0,i-1-ind);
            int pi = (i+1)-1;
            int pmin = min_choices+1;
            cnt+=Math.max(0,prefPow[pi] - prefPow[pmin-1]);
            // System.out.println(i+" "+cnt);
            // System.out.println(i+" "+pi);
        }
        return (int)cnt;
        
    }
}
