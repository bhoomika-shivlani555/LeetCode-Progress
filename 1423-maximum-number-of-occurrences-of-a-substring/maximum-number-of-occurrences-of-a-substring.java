class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<Character,Integer> freq=new HashMap<>();
        HashMap<String,Integer> map=new HashMap<>();
        String str="";
        int l=0,r=0;
        while(r<s.length())
        {
            char c=s.charAt(r);
            str=str+c;        //character add str andin map too
            if(freq.containsKey(c))
                freq.put(c,freq.get(c)+1);
            else
                freq.put(c,1);

            if(r-l+1>minSize)
            {
                char c1=s.charAt(l);
                str=str.substring(1,str.length());
                l++;
                freq.put(c1,freq.get(c1)-1);
                if(freq.get(c1)==0)
                    freq.remove(c1);
            }
            
            if(r-l+1==minSize)
            {
                //condition
                if(freq.size()<=maxLetters)         //unique char<= maxletters
                {
                    if(map.containsKey(str))
                        map.put(str,map.get(str)+1);
                    else
                        map.put(str,1);
                }
            }
            r++;
        }
        int max=0;
        for(String x:map.keySet())
        {
            max=Math.max(max,map.get(x));
        }
        return max;
    }
}