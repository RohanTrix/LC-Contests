class Solution:
    def thousandSeparator(self, n: int) -> str:
        num = str(n)
        c ,snew= 0, ""
        for i in num[::-1]:
            c+=1
            if c == 4:
                snew+='.'
                c = 1
            snew+=i
        return snew[::-1]
