class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int x=0;x<grid.length;x++)
        {
            for(int y=0;y<grid[x].length;y++)
            {
                if(grid[x][y]<0)
                    count++;
            }
        }
        return count;
    }
}