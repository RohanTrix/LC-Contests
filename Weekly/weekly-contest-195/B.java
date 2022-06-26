class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        for(int i = 0; i<n; i++)
            arr[i] = ((arr[i]%k)+k)%k;
        
        int freq[] = new int[k];
        for(int num : arr)
            freq[num]++;
        for(int i = 1; i<=k/2; i++)
        {
            while(freq[i]>0)
            {
                freq[i]--;
                freq[k-i]--;
            }
            if(freq[k-i]!=0) return false;
        }
        return freq[0]%2==0;
    }
}
