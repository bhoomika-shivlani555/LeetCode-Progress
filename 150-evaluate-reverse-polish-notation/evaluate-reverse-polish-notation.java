class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        int x=1,l=tokens.length;
        s.push(Integer.parseInt(tokens[0]));
        while(x<l)
        {
            String c=tokens[x];
            x++;
            if(!c.equals("*") && !c.equals("/") && !c.equals("+") && !c.equals("-"))
                s.push(Integer.parseInt(c));
            else
            {
                int c1=s.pop();
                int ans=s.pop();
                
                if(c.equals("*"))
                    ans=ans*c1;
                if(c.equals("+"))
                    ans=ans+c1;
                if(c.equals("-"))
                    ans=ans-c1;
                if(c1!=0 && c.equals("/"))
                    ans=ans/c1;
                s.push(ans);
            }
        }
        return s.peek();
    }
}