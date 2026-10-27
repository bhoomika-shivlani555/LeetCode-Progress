class Solution {
    public void dfs(int [][]image,int x,int y,int color,int oldcolor)
    {
        int row=image.length;
        int col=image[0].length;
        if(x<0||y<0||x>=row||y>=col||image[x][y]!=oldcolor||image[x][y]==color)
            return;
        
        image[x][y]=color;
        dfs(image,x+1,y,color,oldcolor);
        dfs(image,x-1,y,color,oldcolor);
        dfs(image,x,y+1,color,oldcolor);
        dfs(image,x,y-1,color,oldcolor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}