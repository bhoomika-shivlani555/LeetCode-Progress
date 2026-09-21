class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> st=new HashMap<>();
        HashMap<Character,Character> ts=new HashMap<>();

        if(s.length()!=t.length())
            return false;

        for(int x=0;x<s.length();x++)
        {
            char cs=s.charAt(x);
            char ct=t.charAt(x);
            
            if(st.containsKey(cs))
            {
                if(st.get(cs)!=ct)
                    return false;
            }
            else
                st.put(cs,ct);

            if(ts.containsKey(ct))
            {
                if(ts.get(ct)!=cs)
                    return false;
            }
            else
                ts.put(ct,cs);
        }
        return true;
    }
}