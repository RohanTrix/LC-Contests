class Solution {
    public boolean isSameAfterReversals(int num) {
        int copy = num;
        int res = 0;
        
        while(num>0)
        {
            res=(num%10)+res*10;
            num/=10;
        }
        //System.out.println(res);
        num = 0;
        while(res>0)
        {
            num=(res%10)+num*10;
            res/=10;
        }
        //System.out.println(num);
        return num==copy;
    }
}
