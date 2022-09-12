class Solution:
    def maxDepth(self, s: str) -> int:
        dep = 0
        maxSoFar = 0
        for i in s:
            
            if i=='(':
                dep+=1
                # print(dep)
                maxSoFar = max(dep, maxSoFar)
            if i==')':
                dep-=1
        return maxSoFar
            
            
