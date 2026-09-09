class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0,r=0;
        int n=nums.length;
        long sum=0;
        HashSet<Integer> set=new HashSet<>();
        long max=sum;
        while(r<n)
        {
            while(set.contains(nums[r]))
            {
                sum=sum-nums[l];
                set.remove(nums[l]);
                l++;
            }
            set.add(nums[r]);
            sum=sum+nums[r];
            if (r-l+1>k) 
            {
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            if(r-l+1==k)
                max=Math.max(max,sum);
            r++;
        }
        return max;
    }
}