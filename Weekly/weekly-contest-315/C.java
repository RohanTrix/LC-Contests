class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i = 0; i<=num; i++)
        {
            if(i + Integer.valueOf(new StringBuilder(""+i).reverse().toString()) == num)
                return true;
        }
        return false;
    }
}
