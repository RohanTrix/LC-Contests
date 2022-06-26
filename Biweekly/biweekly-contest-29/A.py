class Solution:
    def average(self, salary: List[int]) -> float:
        mini, maxi, s = min(salary), max(salary), sum(salary)
        
        return (s-mini-maxi)/(len(salary)-2)
