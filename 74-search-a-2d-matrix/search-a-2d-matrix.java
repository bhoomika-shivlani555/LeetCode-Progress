class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length,c=matrix[0].length;
        int l=0,r=c*rows-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int row=mid/c;
            int col=mid%c;
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }
}