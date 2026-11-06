class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuffer sb=new StringBuffer();
        for(int x=0;x<s.length();x++)
        {
            char c=s.charAt(x);
            if(!st.isEmpty() && c==')' && s.charAt(st.peek())=='(')
                st.pop();
            else if(c==')')
                st.push(x);
            else if(c=='(')
                st.push(x);
        }
        HashSet<Integer> set=new HashSet<>();
        while(!st.isEmpty())
        {
            set.add(st.pop());
        }
        for(int x=0;x<s.length();x++)
        {
            if(!set.contains(x))
                sb.append(s.charAt(x));
        }   
        return sb.toString();
    }
}