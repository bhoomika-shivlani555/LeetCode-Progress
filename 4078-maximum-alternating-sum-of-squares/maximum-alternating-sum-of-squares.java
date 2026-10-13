class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int x=0;x<n;x++)
            nums[x]=nums[x]*nums[x];
        Arrays.sort(nums);
        
        long sum=0;
        for(int x=0;x<n/2;x++)
        {
            sum=sum+nums[n-x-1]-nums[x];
            System.out.println(nums[n-x-1]+" "+nums[x]);
        }
        if(n%2==1)
            sum=sum+nums[n/2];
        return sum;
    }
}