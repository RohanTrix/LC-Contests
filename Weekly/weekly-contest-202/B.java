class Solution {
    public int minOperations(int n) {
        int moves = 0;
        for(int i = 0; i<n/2; i++){
            int move = (2*(n-1-i)+1) - (2*i+1);
            moves+=move/2;
        }
        return moves;
        
    }
}
