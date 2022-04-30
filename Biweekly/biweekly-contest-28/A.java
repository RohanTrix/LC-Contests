class Solution {
    int firstSmallerToRight[];
    public int[] finalPrices(int[] prices) {
        firstSmallerToRight = new int[prices.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.fill(firstSmallerToRight, -1);
        
        for(int i = 0; i<prices.length; i++)
        {
            while(!stack.isEmpty() && prices[stack.peekLast()] >= prices[i] )
                firstSmallerToRight[stack.pollLast()] = prices[i];
            stack.offerLast(i);
        }
        for(int i = 0; i<prices.length; i++)
        {
            prices[i] -= (firstSmallerToRight[i] == -1)?0:firstSmallerToRight[i];
        }
        return prices;
    }
}
