class Solution {
    public int ways(int grid[][], int m,int n,int dp[][])
    {
        if(m==1 && n==1)
            return dp[m][n]=grid[0][0];
    
        if(m<=0 ||n<=0)
            return Integer.MAX_VALUE;
        
        if(dp[m][n]!=-1)
            return dp[m][n];
        
        int h=ways(grid,m,n-1,dp);
        int v=ways(grid,m-1,n,dp);
        return dp[m][n]=grid[m-1][n-1]+Math.min(h,v);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m+1][n+1];

        for(int x=0;x<=m;x++)
            Arrays.fill(dp[x],-1);
        
        return ways(grid,m,n,dp);
    }
}