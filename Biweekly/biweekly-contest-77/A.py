class Solution:
    def countPrefixes(self, words: List[str], s: str) -> int:
        cnt = 0
        for w in words:
            if len(w)>len(s):
                continue
            if s[:len(w)] == w:
                cnt+=1
        return cnt
