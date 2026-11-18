class Solution {
    int maxx(int a,int b,int c)
        {
            if(a>=b && a>=c)
                return a;
            if(b>=a && b>=c)
                return b;
            return c;
        }
        int minn(int a,int b,int c)
        {
            if(a<b && a<c)
                return a;
            if(b<a && b<c)
                return b;
            return c;
        }
    public int maxProduct(int[] nums) {
        if(nums.length==1)
        return nums[0];
        else{
        int min=nums[0],max=nums[0],pro=nums[0];
        for(int x=1;x<nums.length;x++)
        {
            int tempmin=min;
            int tempmax=max;
            max=maxx(nums[x],tempmax*nums[x],tempmin*nums[x]);
            min=minn(nums[x],tempmin*nums[x],tempmax*nums[x]);
            pro=Math.max(max,pro);
        }
        return pro;
        }
    }

}