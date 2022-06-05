class Solution:
    def minMaxGame(self, nums: List[int]) -> int:
        prev = nums
        
        while(len(prev)>1):
            nl = []
            mini = True
            for i in range(0, len(prev), 2):
                if mini:
                    nl.append(min(prev[i],prev[i+1]))
                    mini = not mini
                else:
                    nl.append(max(prev[i], prev[i+1]))
                    mini = not mini
            prev = nl
        return prev[0]
