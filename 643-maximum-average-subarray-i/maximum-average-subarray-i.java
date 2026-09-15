class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0;
        int n=nums.length;
        double max=Double.NEGATIVE_INFINITY;
        double sum=0;
        while(r<n)
        {
            sum+=nums[r];
            if(r-l+1>k)
            {
                sum=sum-nums[l];
                l++;
            }
            if(r-l+1==k)
                max=Math.max(max,sum/k);
            if(r-l+1<k)
            {
                r++;
                continue;
            }
            
            r++;
            
        }
        return max;
    }
}