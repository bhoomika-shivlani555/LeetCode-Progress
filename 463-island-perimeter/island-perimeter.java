class Solution {
    public int dfs(int [][]grid,int x,int y)
    {
        int row=grid.length;
        int col=grid[0].length;

        if(x<0||y<0||x>=row||y>=col||grid[x][y]==0)
            return 1;
        if(grid[x][y]==-1)
            return 0;

        grid[x][y]=-1;
        return dfs(grid,x+1,y)+dfs(grid,x-1,y)+dfs(grid,x,y+1)+dfs(grid,x,y-1);

    }
    public int islandPerimeter(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        for(int x=0;x<row;x++)
        {
            for(int y=0;y<col;y++)
            {
                if(grid[x][y]==1)
                {
                    return dfs(grid,x,y);
                }
            }
        }
        return 0;
    }
}