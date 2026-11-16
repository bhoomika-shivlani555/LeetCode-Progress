class Solution {
    public int game(int n, int nums[],int dp[])
    {
        if(n>=nums.length-1)
            return 0;

        if(dp[n]!=-1)
            return dp[n];
        int min=Integer.MAX_VALUE;
        int a=1;
        while(a<=nums[n] && n+a<nums.length)
        {
            min=Math.min(min,game(n+a,nums,dp));
            a++;
        }
        return dp[n]=(min==Integer.MAX_VALUE)?min:min+1;
    }
    public int jump(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return game(0,nums,dp);
    }
}