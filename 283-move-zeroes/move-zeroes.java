class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,r=l+1;
        while(r<nums.length)
        {
            if(nums[r]==0)
                r++;

            else if(nums[l]!=0)
            {
                l++;
                r=l+1;
            }

            else if(nums[r]!=0 && nums[l]==0)
            {
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            }
            else;
        }
    }
}