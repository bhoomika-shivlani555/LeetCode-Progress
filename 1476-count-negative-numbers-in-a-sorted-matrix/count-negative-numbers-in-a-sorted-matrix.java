class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int x=0;x<grid.length;x++)
        {
            int l=0,r=grid[x].length-1;
            while(l<=r)
            {
                int mid=l+(r-l)/2;
                if(grid[x][mid]<0)
                    r=mid-1;
                else
                    l=mid+1;
            }
            count=count+grid[x].length-l;
        }
        return count;
    }
}