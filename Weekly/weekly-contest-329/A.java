class Solution {
    public int alternateDigitSum(int n) {
        int sign = 1, sum = 0;
        if(String.valueOf(n).length()%2 == 0) sign = -1;
        while(n>0)
        {
            int d = n%10;
            sum+=(d*sign);
            sign*=-1;
            n/=10;
        }
        return sum;
    }
}
