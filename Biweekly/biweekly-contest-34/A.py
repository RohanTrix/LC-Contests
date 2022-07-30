class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        n = len(mat)
        s = 0
        for i in range(n):
            s+=mat[i][i]
            s+=mat[i][~i] #  ~i  ===  n-i-1
        
        if n & 1:
            s-=mat[n//2][n//2]
        return s
