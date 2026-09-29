class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>=target)
            {
                first=mid;
                r=mid-1;
            }
            else
                l=mid+1;
        }
        int arr[]=new int[2];
        if(first==-1  || nums[first]!=target)
         {arr[0]=-1;
            arr[1]=-1;
            return arr;}
        int last=nums.length;
        l=0;
        r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>target)
            {
                last=mid;
                r=mid-1;
            }
            else
                l=mid+1;
        }
        arr[0]=first;
        arr[1]=last-1;
        return arr;
    }
}