class Solution:
    def numberOfPairs(self, nums: List[int]) -> List[int]:
        d = Counter(nums)
        cnt1 =0
        cnt2 = 0
        for k in d.keys():
            cnt1+=d[k]//2
            cnt2+=d[k]%2
        return [cnt1,cnt2]
            
