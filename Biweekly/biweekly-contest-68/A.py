class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        cnt = 0
        for s in sentences:
            cnt=max(cnt,len(s.split()))
        return cnt
