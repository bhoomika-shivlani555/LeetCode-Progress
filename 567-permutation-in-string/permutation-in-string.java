class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s2.length();
        int k=s1.length();
        int l=0,r=0;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int x=0;x<k;x++)
            map.put(s1.charAt(x),map.getOrDefault(s1.charAt(x),0)+1);

        while(r<n)
        {
            char c=s2.charAt(r);
            map2.put(c,map2.getOrDefault(c,0)+1);
            if(r-l+1>k)
            {
                char c1=s2.charAt(l);
                map2.put(c1,map2.get(c1)-1);
                if(map2.get(c1)==0)
                    map2.remove(c1);
                l++;
            }
            if(r-l+1==k)
            {
                if(map2.equals(map))
                    return true;
            }
            r++;
        }
        return false;
    }
}