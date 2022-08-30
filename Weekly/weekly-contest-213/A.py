class Solution:
    def canFormArray(self, arr: List[int], arrs: List[List[int]]) -> bool:
        d = Counter()
        for p in arrs:
            d[p[0]] = p
        k = 0
        while k<len(arr):
            v = arr[k]
            if arr[k] not in d:
                return False
            for num in d[v]:
                if arr[k] == num:
                    k+=1
                else:
                    return False
        return True
