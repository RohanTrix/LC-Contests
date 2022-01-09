class Solution {
    static class TrieNode
    {
        char data = '\0';
        TrieNode children[] = new TrieNode[26];
        int wordEnd;
        public TrieNode(char c)
        {
            data = c;
        }
        public void insertString(TrieNode root, char[] s)
        {
            TrieNode curr = root;
            for(char ch : s)  
            {
                TrieNode next = curr.children[ch-'a'];
                if(next == null)
                {
                    next = new TrieNode(ch);
                    curr.children[ch-'a'] = next;
                }
                curr = next;
            }
            curr.wordEnd++;
        }
        public boolean searchWord(TrieNode root, char[] s)
        {
            TrieNode v = root;
            for(char ch : s)
            {
                TrieNode next = v.children[ch-'a'];
                if(next==null)
                    return false;
                v = next;
            }
            return v.wordEnd>0;
        }
    }
    public int wordCount(String[] start, String[] target) {
        TrieNode root = new TrieNode('\0');
        
        for(String s: start)
        {
            String snew = "";
            for(int i = 'a';i<='z'; i++)
            {
                snew = s+(char)i;
                char str[] = snew.toCharArray();
                Arrays.sort(str);
                root.insertString(root, str);
            }
        }
        int cnt = 0;
        for(String s: target)
        {
            char str[] = s.toCharArray();
            Arrays.sort(str);
            boolean x = root.searchWord(root, str);
            
            cnt+=x?1:0;
        }
        return cnt;
    }
}
