class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int totcost = 0;
        int i = 0;
        if(cost.length==1)return cost[0];
        if(cost.length==2)return cost[0]+cost[1];
        for(i =cost.length -3; i>=0; i-=3)
        {
            
            int cnt = 0;
            if(i+1<n){cnt++;totcost+=cost[i+1];}
            if(i+2<n){cnt++;totcost+=cost[i+2];}
            totcost+=(cnt==2)?0:cost[i];
            
        }
        i+=3;
        for(int p = 0; p<i; p++)totcost+=cost[p];
        return totcost;
    }
}
