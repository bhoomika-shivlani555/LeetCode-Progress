class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int x=1;
        st.push(s.charAt(0));
        while(x<s.length())
        {
            st.push(s.charAt(x));
            x++;
            int n=st.size();
            if(st.size()>=3 && st.get(n-1)=='c' && st.get(n-2)=='b' && st.get(n-3)=='a')
            {
                st.pop();
                st.pop();
                st.pop();
            }
        }
        return st.isEmpty();
    }
}