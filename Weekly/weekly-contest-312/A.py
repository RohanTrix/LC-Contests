class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        return [name for h, name in sorted(zip(heights, names))][::-1]
