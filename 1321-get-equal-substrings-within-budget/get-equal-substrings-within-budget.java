class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0,r=0;
        int n=s.length();
        int k=maxCost;
        int tc=0,max=0;
        while(r<n)
        {
            tc+=Math.abs(s.charAt(r)-t.charAt(r));
            while(l<=r && tc>k)
            {
                tc=tc-Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}