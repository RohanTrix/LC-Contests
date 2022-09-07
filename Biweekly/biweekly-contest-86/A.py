class Solution:
    def findSubarrays(self, nums: List[int]) -> bool:
        s = set()
        for i in range(1, len(nums)):
            if nums[i] + nums[i-1] in s:
                return True
            s.add(nums[i]+nums[i-1])
        return False
