class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length,sum=0;
        for(int x=0;x<n;x++)
        {
            sum+=mat[x][x];
            if(n-1-x!=x)
                sum+=mat[x][n-1-x];
        }
        return sum;
    }
}