class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0,idx=0;
        for(int x=0;x<mat.length;x++)
        {
            int one=0;
            for(int y=0;y<mat[x].length;y++)
            {
                if(mat[x][y]==1)
                    one++;
            }
            if(max<one)
            {
                max=one;
                idx=x;
            }
        }
        return new int[]{idx,max};
    }
}