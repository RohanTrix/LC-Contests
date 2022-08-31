class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        d = Counter(nums)
        l = [(v,k) for k,v in d.items()]
        l.sort(key = lambda x : (x[0], -x[1]))
        nums = []
        for v,k in l:
            for i in range(v):
                nums.append(k)
        return nums
