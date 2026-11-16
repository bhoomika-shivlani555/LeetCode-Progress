class Solution {
    public int stair(int n,int cost[],int dp[])
    {
        if(n==0 || n==1)
            return cost[n];
        if(n<0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        int way1=stair(n-1,cost,dp);
        int way2=stair(n-2,cost,dp);
        dp[n]=Math.min(way1,way2)+cost[n];
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(stair(n - 1, cost, dp),
                        stair(n - 2, cost, dp));
    }
}