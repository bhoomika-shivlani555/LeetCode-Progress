class Solution {
    public boolean judgeSquareSum(int c) {
        /*if(c==0)
            return true;
        HashSet<Integer> set=new HashSet<>();
        for(int x=1;x<=Math.sqrt(c);x++)
        {
            set.add(x*x);
        }

        for(int x:set)
            if(set.contains(c-x) || set.contains(c))
                return true;
        return false;*/

        double l=0, r=(int)Math.sqrt(c);
        while(l<=r)
        {
            double val=l*l+r*r;
            if(val==c)
                return true;
            if(val>c)
                r--;
            else
                l++;
        }
        return false;
    }
}