class Solution:
    def evenOddBit(self, n: int) -> List[int]:
        s = bin(n)[2:][::-1]
        c1 = c0 = 0
        for i in range(0,len(s)):
            if s[i] == '1':
                if i%2 == 0:
                    c0+=1
                else:
                    c1+=1
                
        return [c0, c1 ]
