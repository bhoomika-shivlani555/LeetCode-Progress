class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while(r<n)
        {
            sum+=nums[r];
            while( sum>=target)
            {
                min=Math.min(min,r-l+1);
                sum=sum-nums[l];
                l++;
            }
            r++;      
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        else
            return min;
    }
}