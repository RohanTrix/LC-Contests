class Solution {
    public boolean isValid(int der[], int v) {
        int org = v;
        for(int i = 0; i<der.length-1; i++) {
            int next = v^der[i];
            v = next;
        }
        return (org^v) == der[der.length-1];
    }
    public boolean doesValidArrayExist(int[] derived) {
        return isValid(derived, 0) || isValid(derived, 1);
    }
}
