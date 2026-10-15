class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0,count=0;
        for(int x=0;x<nums.length;x++)
        {
            if(count==0)
                 candidate = nums[x];

            if(nums[x]==candidate)
                count++;
            else
                count--; 
        }
        return candidate;
    }
}