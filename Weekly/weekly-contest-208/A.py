class Solution:
    def minOperations(self, logs: List[str]) -> int:
        dep = 0
        for log in logs:
            if log == '../':
                dep = max(0,dep-1)
            elif log == './':
                continue
            else:
                dep+=1
        return dep
