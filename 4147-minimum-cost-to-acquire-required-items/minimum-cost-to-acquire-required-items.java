class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        return Math.max(bound(need1,cost1,need2,cost2,costBoth),bound(need2,cost2,need1,cost1,costBoth));
    }
    long bound(long needA, int costA, long needB, int costB, int costBoth) 
    {
        int x=Math.min(costA,costBoth); 
        int y=Math.min(costB,costBoth-x);  
        return needA *x+needB*y;
    }
}