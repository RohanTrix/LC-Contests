class Solution {
    public int countEven(int n) {
        int cnt = 0;
        for(int i = 1; i<=n; i++)
        {
            int s = 0;
            int num = i;
            while(num>0)
            {
                s+=(num%10);
                num/=10;
            }
            if(s%2==0)cnt++; 
        }
        return cnt;
    }
}
