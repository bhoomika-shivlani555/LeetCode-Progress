class Solution {
    public void rotate(int[][] matrix) {
        for(int x=0;x<matrix.length;x++)
        {
            for(int y=x+1;y<matrix[x].length;y++)
            {
                int temp=matrix[x][y];
                matrix[x][y]=matrix[y][x];
                matrix[y][x]=temp;
            }
        }
        for(int x=0;x<matrix.length;x++)
        {
            int l=0,r=matrix.length-1;
            while(l<r)
            {
                int temp=matrix[x][l];
                matrix[x][l]=matrix[x][r];
                matrix[x][r]=temp;
                l++;r--;
            }
        }
    }

    private boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }
}