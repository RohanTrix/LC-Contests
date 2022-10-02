class Solution {
    public int gcd(int a, int b)
    {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public int commonFactors(int a, int b) {
        int g = gcd(a,b);
        int c = 0;
        for(int i = 1; i*i<=g; i++)
            if(g%i == 0)
            {
                c+=2;
                if(g/i == i)
                    c--;
            }
        return c;
    }
}
