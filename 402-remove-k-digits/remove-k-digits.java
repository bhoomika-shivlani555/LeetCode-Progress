class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s=new Stack<>();
        for(int x=0;x<num.length();x++)
        {
            int curr=num.charAt(x)-'0';
            while(!s.isEmpty() && k>0 && s.peek()>curr)
            {
                s.pop();
                k--;
            }
            s.push(curr);
        }
        while(k>0 && !s.isEmpty()) 
        {
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()) 
        {
            sb.insert(0,s.pop());
        }
        
        while(sb.length()>0 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);

        return sb.length()==0 ? "0" : sb.toString();
    }
}