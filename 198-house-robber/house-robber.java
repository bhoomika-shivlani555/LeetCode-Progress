class Solution {
    // public int solve(int idx,int nums[], int memo[])
    // {
    //     if(idx==0)
    //         memo[0]=nums[0];
    //     if(idx<0)
    //         return 0;
    //     if(memo[idx]!=-1)
    //         return memo[idx];
    //     int take=nums[idx]+solve(idx-2,nums,memo);
    //     int nottake=0+solve(idx-1,nums,memo);
    //     return memo[idx]=Math.max(take,nottake);
    // }
    public int rob(int[] nums) {
        int n=nums.length;
        // int memo[]=new int[n];
        // Arrays.fill(memo,-1);
        // return solve(n-1,nums,memo);

        int dp[]=new int[n];
        dp[0]=nums[0];
        if(n<2)
            return dp[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int x=2;x<n;x++)
        {
            int take=nums[x]+dp[x-2];
            int nottake=0+dp[x-1];
            dp[x]=Math.max(take,nottake);
        }
        return dp[n-1];
    }
}