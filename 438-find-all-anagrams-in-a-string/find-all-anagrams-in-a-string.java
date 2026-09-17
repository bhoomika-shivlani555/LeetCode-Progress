class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int x=0;x<p.length();x++)
        {
            char c=p.charAt(x);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        List<Integer> list=new ArrayList<>();
        int n=s.length();
        int l=0,r=0;
        while(r<n)
        {
            char c=s.charAt(r);
            if(map2.containsKey(c))
                map2.put(c,map2.get(c)+1);
            else
                map2.put(c,1);
            
            // if(!map.containsKey(c))
            // {
            //     l=r;
            //     map2=new HashMap<>();
            // }

            if(r-l+1>p.length())
            {
                char c1=s.charAt(l);
                map2.put(c1,map2.get(c1)-1);
                if(map2.get(c1)==0)
                    map2.remove(c1);
                l++;
            }
            if(r-l+1==p.length())
            {
                if(map.equals(map2))
                    list.add(l);
                
            }
            r++;
        }
        
        return list;
    }
}