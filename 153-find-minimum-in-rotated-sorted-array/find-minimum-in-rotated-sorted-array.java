class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1,min=nums[0];
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[r])      //min is towards right
                l=mid+1;
            else
            {
                min=Math.min(min,nums[mid]);
                r=mid-1;
            }

        }
        return min;
    }
}