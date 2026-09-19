class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int l=0,r=0,n=nums.length;
        int sum=0,max=0;
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
            max=Math.max(max,sum);
            r++;
        }
        return max;
    }
}