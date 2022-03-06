class Solution:
    def mostFrequent(self, nums: List[int], key: int) -> int:
        
        d = Counter()
        
        for i in range(len(nums)-1):
            if nums[i] == key:
                d[nums[i+1]]+=1
        
        maxi = -1
        ans = 0
        for i in d.keys():
            if d[i]>maxi:
                maxi = d[i]
                ans = i
        return ans
