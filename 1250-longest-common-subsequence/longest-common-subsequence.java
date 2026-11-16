class Solution {
    public int lcs(String s1,String s2, int i, int j,int dp[][])
    {
        if(i==0 || j==0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];

        if(s1.charAt(i-1)==s2.charAt(j-1))
            return dp[i][j]=1+lcs(s1,s2,i-1,j-1,dp);
        
        return dp[i][j]=Math.max(lcs(s1,s2,i,j-1,dp),lcs(s1,s2,i-1,j,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int x=0;x<m+1;x++)
        {
            Arrays.fill(dp[x],-1);
        }
        return lcs(text1,text2,m,n,dp);

        // Arrays.fill(dp[0],0);
        // for(int x=0;x<=m;x++)
        //     dp[x][0]=0;

        // for(int i=1;i<=m;i++)
        // {
        //     for(int j=1;j<=n;j++)
        //     {
        //         if(text1.charAt(i-1)==text2.charAt(j-1))
        //             dp[i][j]=1+dp[i-1][j-1];

        //         else
        //             dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
        //     }

        // }
        // return dp[m][n];
    }
}