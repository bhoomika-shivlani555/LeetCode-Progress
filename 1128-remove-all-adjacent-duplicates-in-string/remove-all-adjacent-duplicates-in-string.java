class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        StringBuffer sb=new StringBuffer();
        for(int x=0;x<s.length();x++)
        {
            char c=s.charAt(x);
            if(!st.isEmpty() && st.peek()==c)
                st.pop();
            else
                st.push(c);
        }
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}