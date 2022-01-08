class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {
        Arrays.sort(ast);
        long store = mass;
        for(int i :ast)
        {
            if(store<i) return false;
            store+=(long)i;
        }
        return true;
    }
}
