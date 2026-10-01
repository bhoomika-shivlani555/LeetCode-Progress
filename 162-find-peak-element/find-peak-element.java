class Solution { 
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1,ans=r;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(mid!=nums.length-1 && nums[mid]>=nums[mid+1])      
            {
                ans=mid;
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return ans;
    }
}