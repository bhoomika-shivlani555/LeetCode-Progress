class Solution {
    public String makeFancyString(String s) {
        if(s.length()<=2)
            return s;

        StringBuilder sb=new StringBuilder();
        for(int x=0;x<s.length();x++)
        {
            char c=s.charAt(x);
            int n=sb.length();

            if(n>=2 && sb.charAt(n-1)==c && sb.charAt(n-2)==c)
                continue;

            sb.append(c);
        }
        return sb.toString();
    }
}