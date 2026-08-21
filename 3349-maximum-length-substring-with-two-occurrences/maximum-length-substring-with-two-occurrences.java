class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0,r=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int max=1;
        while(r<s.length())
        {
            char c=s.charAt(r);
            if(map.containsKey(c))
            {
                while(l<r && map.get(c)>=2)
                {
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    l++;

                }
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
            max=Math.max(r-l+1,max);
            r++;
        }
        return max;
    }
}