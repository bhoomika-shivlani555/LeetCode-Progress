class Solution {
    public void moveZeroes(int[] nums) {
        int zero=0;
        int arr[]=new int[nums.length];
        int  k=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]!=0)
                arr[k++]=nums[x];
        }
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==0)
                arr[k++]=0;
        }
        for(int x=0;x<nums.length;x++)
        {
            nums[x]=arr[x];
        }
    }
}