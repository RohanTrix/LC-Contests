class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        cnt = 0
        for w in words:
            if len(w) >= len(pref) and pref == w[:len(pref)]:
                cnt+=1
        return cnt
