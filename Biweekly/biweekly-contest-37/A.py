class Solution:
    def trimMean(self, arr: List[int]) -> float:
        arr.sort()
        percent = int(len(arr)*0.05)
        print(percent)
        return sum(arr[percent: -percent])/(len(arr) - 2*percent)
