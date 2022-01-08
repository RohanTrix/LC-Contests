/*
        IDEA: We make map[26][26] mapping one letter to another. If we get a string "ab", we increment map[0][1] by 1.
              Now we handle the two cases:
                    1) String with diff chars
                    2) String with same chars

                Case 1: If I have 3 "ab" and 2 "ba"....I need to take min(3,2) and only this much can be paired.

                Case 2: If I have even number of "bb", I can pair them up and use all.

                        If I have odd number of "bb", I can pair odd-1 np. of "bb" and the single extra "bb" can be used
                        in the middle of the palindrome. However, since we have only 1 single middle position, out of all
                        the letters with single extra str, we can only use atmost 1.
                        Hence we keep a check if at least one single extra same letter pair occurs, then we add 2 
                        to the answer.
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
