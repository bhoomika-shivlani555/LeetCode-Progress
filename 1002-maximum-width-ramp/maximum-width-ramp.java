class Solution {
    public int maxWidthRamp(int[] nums) {
        int l=nums.length;
        int max=0;
        int arr[]=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        for(int x=0;x<l;x++)
        {
            if(s.isEmpty() || nums[s.peek()]>=nums[x])
                s.push(x);
        }
        for(int x=l-1;x>=0;x--)
        {
            while(!s.isEmpty() && nums[s.peek()]<=nums[x])
            { 
                max=Math.max(max,x-s.peek());
                s.pop();
            }
        }
        return max;
    }
}