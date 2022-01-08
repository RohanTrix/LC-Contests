/*
        IDEA: We ma

*/

class Solution {
    public int longestPalindrome(String[] words) {
        int map[][] = new int[26][26];
        for(String s : words)
        {
            int ch1 = s.charAt(0)-'a';
            int ch2 = s.charAt(1)-'a'; 
            map[ch1][ch2]+=1;
        }
        int sum = 0;
        int one = 0;
        for(int i =0; i<26; i++)
        {
            for(int j = i+1;j<26;j++)
            {
                sum+=(Math.min(map[i][j], map[j][i])*4);  
            }
        }
        for(int i =0; i<26;i++)
        {
            if(map[i][i]%2==0)
                sum+=(map[i][i]*2);
            else
            {
                sum+=(map[i][i]-1)*2;
                one++;
            }
        }
        return sum + (one>0?2:0);
        
    }
}
