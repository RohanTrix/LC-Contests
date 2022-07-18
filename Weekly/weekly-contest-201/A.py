class Solution:
    def makeGood(self, s: str) -> str:
        st = []
        for ch in s:
            if len(st) == 0:
                st.append(ch)
            else:
                if(st[-1].lower() == ch.lower() and st[-1] != ch):
                    st.pop()
                else:
                    st.append(ch)
        return ''.join(st)
