class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        s = set()
        maxi = -1
        for num in nums:
            if -num in s:
                maxi = max(maxi, num, -num)
            s.add(num)
        return maxi
