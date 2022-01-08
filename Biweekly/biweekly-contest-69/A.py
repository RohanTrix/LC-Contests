class Solution:
    def capitalizeTitle(self, title: str) -> str:
        snew = []
        for w in title.split(' '):
            if len(w)>2:
                w.title()
            else:
                w.lower()
            snew.append(w)
        
        return ' '.join(snew);
