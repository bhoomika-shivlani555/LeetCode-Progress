class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] =new int[nums.length];
        int p=0,n=1;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]<0)
                {arr[n]=nums[x];n=n+2;}
            else
                {arr[p]=nums[x];p=p+2;}
        }
        return arr;
    }
}