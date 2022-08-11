class Solution:
    def specialArray(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        for i in range(1000+1):
            if n - bisect_left(nums, i) == i:
                return i
        return -1
