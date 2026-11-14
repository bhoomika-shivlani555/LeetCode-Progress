class Solution {
    public int func(int n,int memo[])
    {
        if(n==0)
            memo[0]=0;

        if(n==1)
            memo[1]=1;

        if(n>=n && n==2)
            memo[2]=2;
        
        if(memo[n]!=-1)
            return memo[n];

        memo[n]=func(n-1,memo)+func(n-2,memo);
        return memo[n];
    }
    public int climbStairs(int n) {
        int memo[]=new int[n+1];
        Arrays.fill(memo,-1);
        return func(n,memo);
    }
}