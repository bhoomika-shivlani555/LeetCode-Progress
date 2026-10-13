class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,curr=0;
        int sum=(n*(n+1))/2;
        for(int x=0;x<n;x++)
            curr+=nums[x];
        return sum-curr;
    }
}