class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        int l=0,r=9;
        while(r<s.length())
        {
            String ss=s.substring(l,r+1);
            if(map.containsKey(ss))
                map.put(ss,map.get(ss)+1);
            else
                map.put(ss,1);
            l++;
            r++;
        }
        List<String> list= new ArrayList<>();
        for(String x:map.keySet())
            if(map.get(x)>=2)
                list.add(x);

        return list;
    }
}