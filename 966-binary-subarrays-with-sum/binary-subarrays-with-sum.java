class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int l=0,r=0,n=nums.length;
        int sum=0,count=0,zero=0;
        while(r<n)
        {
            sum=sum+nums[r];
            while(l<r && (nums[l]==0 || sum>goal))
            {
                if(nums[l]==0)
                    zero++;
                else
                    zero=0;

                sum=sum-nums[l];
                l++;
            }
            if(sum==goal)
            {
                count+=zero+1;
            }
            r++;
        }
        return count;
    }
}