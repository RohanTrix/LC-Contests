class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int row[] = new int[n];
        int i =0;
        for(String s: bank)
        {
            for(char ch : s.toCharArray())
                row[i]+=ch-'0';
            i++;
        }
        int ans = 0;
        int lastRow = row[0];
        for(i = 1;i<n;i++)
        {
            if(row[i]==0) continue;
            ans+=(row[i]*lastRow);
            lastRow = row[i];
        }
        return ans;
    }
}
