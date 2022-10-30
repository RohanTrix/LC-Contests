class Solution:
    def averageValue(self, nums: List[int]) -> int:
        l = list(filter(lambda x : x%6 == 0, nums))
        return sum(l)// len(l) if len(l) else 0
        
