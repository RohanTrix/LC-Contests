class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : amount)
            if(num>0)
                pq.offer(num);
        int ans = 0;
        while(pq.size()>1)
        {
            int a = pq.poll();
            int b = pq.poll();
            a--; b--;
            ans++;
            if(a>0) pq.offer(a);
            if(b>0) pq.offer(b);
        }
        if(pq.size()>0)
            ans+=pq.poll();
        return ans;
        
    }
}
