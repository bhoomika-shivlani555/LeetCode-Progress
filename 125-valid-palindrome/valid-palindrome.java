class Solution {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        s=s.toLowerCase();
        while(l<=r)
        {
            char c1=s.charAt(l);
            char c2=s.charAt(r);
            if(!Character.isLetterOrDigit(c1))
                l++;
            else if(!Character.isLetterOrDigit(c2))
                r--;
            else if(c1==c2)
                {
                    l++;
                    r--;
                }
            else 
                return false;
        }
        return true;
    }
}