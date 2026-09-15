class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0,r=0;
        int n=nums.length;
        long max=0l,sum=0l;
        HashSet<Integer> set=new HashSet<>();
        while(r<n)
        {
            sum=sum+nums[r];
            while(l<r && set.contains(nums[r]))
            {
                sum=sum-nums[l];
                set.remove(nums[l]);
                l++;
            }
            set.add(nums[r]);

            if(r-l+1>k)
            {
                sum=sum-nums[l];
                set.remove(nums[l]);
                l++;
            }

            if(r-l+1==k && set.size()==k)
                max=Math.max(max,sum);
            r++;     
        }
        return max;
    }
}