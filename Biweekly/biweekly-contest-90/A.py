class Solution:
    def oddString(self, words: List[str]) -> str:
        d = defaultdict(list)
        for w in words:
            l = []
            for i in range(len(w) - 1):
                l.append(ord(w[i+1]) - ord(w[i]))
            d[tuple(l)].append(w)
        
        for k,v in d.items():
            if len(v) == 1:
                return v[0]
        
