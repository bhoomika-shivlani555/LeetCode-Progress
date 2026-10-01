class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,r=nums.length-1,ans=nums[r];
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int mid2=mid;
            if(mid%2!=0)
                mid2=mid-1;
            if(mid!=nums.length-1 && nums[mid2]!=nums[mid2+1])
            {
                ans=nums[mid2];
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return ans;
    }
}