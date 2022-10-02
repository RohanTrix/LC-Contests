class Solution:
    def equalFrequency(self, word: str) -> bool:
        d = Counter(word)
        l = list(d.keys())
        for let in l:
            d[let]-=1
            
            s = set()
            for v in d.values():
                if v == 0:
                    continue
                s.add(v)
            if len(s) == 1:
                return True
            d[let]+=1
        return False
