//write next greater-I part1 codde 2 times
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ng[]=new int[nums.length];
        Stack<Integer> s=new Stack<>();
       
        for(int x=2*nums.length-1;x>=0;x--) 
        { 
            int i=x%nums.length;
            while(!s.isEmpty() && nums[s.peek()]<=nums[i])
                s.pop();
            if(s.isEmpty()) 
                ng[i]=-1; 
            else 
                ng[i]=nums[s.peek()];
            s.push(i); 
        }
        return ng;
    }
}