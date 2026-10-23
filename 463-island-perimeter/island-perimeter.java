class Solution {
    public int bfs(int grid[][],int x,int y)
    {
        int row=grid.length;
        int col=grid[0].length;
        Queue<int []> q=new LinkedList<>();
        int directions[][]={{0,1},{0,-1},{1,0},{-1,0}};
        int peri=0;
        int a2[]={x,y};
        q.offer(a2);
        grid[x][y]=-1;

        while(!q.isEmpty())
        {
            int arr[]=q.poll();
            for(int i[]:directions)
            {
                int a=arr[0]+i[0];
                int b=arr[1]+i[1];

                if(a<0|| b<0 || a>=row|| b>=col || grid[a][b]==0)
                    peri++;

                else if(grid[a][b]==-1)
                    continue;
                
                else
                {
                    int a1[]={a,b};
                    q.offer(a1);
                    grid[a][b]=-1;
                }
            }
        }
        return peri;
    }
    public int islandPerimeter(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        for(int x=0;x<row;x++)
        {
            for(int y=0;y<col;y++)
            {
                if(grid[x][y]==1)
                    return bfs(grid,x,y);
            }
        }
        return -1;
    }
}