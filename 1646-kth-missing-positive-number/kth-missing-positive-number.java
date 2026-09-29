class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int cal=arr[mid]-mid-1;

            if(k<=cal)
                r=mid-1;
            else
                l=mid+1;
        }
        return l+k;
    }
}