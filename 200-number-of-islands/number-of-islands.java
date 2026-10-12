class Solution {
    public void dfs(char[][]grid,int x, int y)
    {
        int row=grid.length;
        int col=grid[0].length;
        if(x<0||x>=row||y>=col ||y<0 || grid[x][y]=='0')
            return;
        grid[x][y]='0';

        dfs(grid,x+1,y);
        dfs(grid,x-1,y);
        dfs(grid,x,y+1);
        dfs(grid,x,y-1);
    }
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int x=0;x<row;x++)
        {
            for(int y=0;y<col;y++)
            {
                if(grid[x][y]=='1')
                {
                    count++;
                    dfs(grid,x,y);
                }
            }
        }
        return count;
    }
}