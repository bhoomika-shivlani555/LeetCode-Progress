class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,n=nums.length;
        int max=0,one=0,zero=0;
        while(r<n)
        {
            if(nums[r]==0)
                zero++;
            else
                one++;

            while(zero>k)
            {
                if(nums[l]==0)
                    zero--;
                else
                    one--;
                l++;
            }
            if(zero<=k)
                max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}