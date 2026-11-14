class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        if(n<2)
            return dp[n];
        dp[2]=2;
        for(int x=3;x<=n;x++)
        {
            dp[x]=dp[x-1]+dp[x-2];
        }
        return dp[n];
    }
}