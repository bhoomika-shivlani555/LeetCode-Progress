class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        int n=asteroids.length;
        for(int x=0;x<n;x++)
        {
            int curr=asteroids[x];
            if(curr>0)
            {
                s.push(curr);
                continue;
            }
            while(!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(curr))
                s.pop();
            if(!s.isEmpty() && s.peek()==Math.abs(curr))
            {
                s.pop();
                continue;
            }
            if(s.isEmpty() || s.peek()<0)
                s.push(curr);
        
        }
        int arr[]=new int[s.size()];
        for(int x=arr.length-1;x>=0;x--)
            arr[x]=s.pop();

        return arr;
    }
}