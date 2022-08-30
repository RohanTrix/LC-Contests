class Solution:
    def countVowelStrings(self, n: int) -> int:
#       IDEA : dp[n][ind] = No. of lexicographic sorted combinations with n letters left and current vowel as
#                           ind'th vowel

        @cache
        def dfs(i, ch):
            if i == n-1:
                return 1
            c = 0
            for curr in "aeiou":
                if ord(curr)>=ord(ch):
                    c+=dfs(i+1, curr)
            return c
        
        ans = 0
        for ch in "aeiou":
            ans+=dfs(0, ch)
        return ans
