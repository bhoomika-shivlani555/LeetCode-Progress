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

        // for(int x=0;x<=m;x++)
        //     Arrays.fill(dp[x],-1);
        
        // return ways(grid,m,n,dp);

        dp[1][1]=grid[0][0];
        for(int x=2;x<=m;x++)
            dp[x][1]=dp[x-1][1]+grid[x-1][0];
        for(int x=2;x<=n;x++)
            dp[1][x]=dp[1][x-1]+grid[0][x-1];

        for(int x=2;x<=m;x++)
        {
            for(int y=2;y<=n;y++)
            {
                dp[x][y]=grid[x-1][y-1]+Math.min(dp[x-1][y],dp[x][y-1]);
            }
        }
        return dp[m][n];
    }
}