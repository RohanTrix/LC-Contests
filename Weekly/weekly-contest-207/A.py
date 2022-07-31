class Solution:
    def reorderSpaces(self, text: str) -> str:
        words = text.split()
        c = 0
        for ch in text:
            c+=1 if ch == ' ' else 0
        
        if len(words) == 1:
            return words[0] + ''.join([' ']*c)
        
        inBetween, extra = divmod(c,(len(words) - 1))
        ans = []
        for w in words:
            ans.append(w)
            ans.append(''.join([' ']*inBetween))
        ans.pop()
        ans.append(''.join([' ']*extra))
        return ''.join(ans)
