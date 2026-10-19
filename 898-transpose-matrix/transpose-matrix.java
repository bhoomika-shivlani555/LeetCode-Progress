class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int arr[][]=new int[c][r];
        for(int x=0;x<r;x++)
        {
            for(int y=0;y<c;y++)
                arr[y][x]=matrix[x][y];
        } 
        return arr;       
    }
}