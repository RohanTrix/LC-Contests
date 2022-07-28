class Solution {
    public String modifyString(String s) {
        char str[] = s.toCharArray();
        int n = str.length;
        for(int i = 0; i<n; i++)
        {
            char ch = str[i];
            if(Character.isLetter(ch)) {continue;}
            
            if(i == 0)
            {
                char rep = 'a';
                str[i] = 'a';
                if(i+1<n) str[i] = str[i+1] == 'a'?'b':'a';
            }
            else if(i == n-1)
            {
                char rep = 'a';
                str[i] = str[i-1] == 'a'?'b':'a';
            }
            else
            {
                char left = str[i-1];
                char right = str[i+1];
                if(left == 'a')
                    str[i] = right=='b'?'c':'b';
                else if(left == 'b')
                    str[i] = right=='a'?'c':'a';
                else
                    str[i] = right=='a'?'b':'a';
            }
        }
        return new String(str);
    }
}
