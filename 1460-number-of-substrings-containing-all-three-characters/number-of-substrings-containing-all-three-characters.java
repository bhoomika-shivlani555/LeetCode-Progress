class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,r=0,n=s.length();
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        
        while(r<n)
        {
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.size()==3)
            {
                char c1=s.charAt(l);
                count+=n-r;
                map.put(c1,map.get(c1)-1);
                if(map.get(c1)==0)
                    map.remove(c1);
                l++;
            }
            r++;
        }
        return count;
    }
}