class Solution {
    class pair
    {
        int x;
        int y;
        public pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<pair> q=new LinkedList<>();
        int oranges=0;
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                if(grid[x][y]==2)
                    q.add(new pair(x,y));
                if(grid[x][y]==1)
                    oranges++;
            }
        }
        q.add(new pair(-1,-1));

        while(!q.isEmpty())
        {
            pair p=q.poll();
            int x=p.x,y=p.y;
            if(x!=-1&&y!=-1)
            {
                if(x<m-1 && grid[x+1][y]==1)
                {
                    q.add(new pair(x+1,y));
                    grid[x+1][y]=2;
                    oranges--;
                }
                if(x>0 && grid[x-1][y]==1)
                {
                    q.add(new pair(x-1,y));
                    grid[x-1][y]=2;
                    oranges--;
                }
                if(y<n-1 && grid[x][y+1]==1)
                {
                    q.add(new pair(x,y+1));
                    grid[x][y+1]=2;
                    oranges--;
                }
                if(y>0 && grid[x][y-1]==1)
                {
                    q.add(new pair(x,y-1));
                    grid[x][y-1]=2;
                    oranges--;
                }
            }
            else
            {
                if(q.isEmpty())
                    break;
                count++;
                q.add(new pair(-1,-1));
            }

        }
        if(oranges==0)
            return count;
        else
            return -1;
    }
}