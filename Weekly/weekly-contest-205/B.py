class Solution:
    def numTriplets(self, nums1: List[int], nums2: List[int]) -> int:
        d = Counter()
        cnt = 0
        for c in nums1:
            d.clear()
            target = c*c
            for num in nums2:
                if target%num == 0:
                    cnt+=d[target//num]
                d[num]+=1
        
        for c in nums2:
            d.clear()
            target = c*c
            for num in nums1:
                if target%num == 0:
                    cnt+=d[target//num]
                d[num]+=1
        return cnt
