class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        d = defaultdict(list)
        for i, ch in enumerate(s):
            d[ch].append(i)
        maxi = -1
        for v in d.values():
            if len(v)>1:
                maxi = max(maxi, v[-1] - v[0] - 1)
        return maxi
                    
                    
