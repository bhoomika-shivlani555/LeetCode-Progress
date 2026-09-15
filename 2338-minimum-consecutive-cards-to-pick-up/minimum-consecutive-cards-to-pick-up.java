class Solution {
    public int minimumCardPickup(int[] cards) {
        HashSet<Integer> set=new HashSet<>();
        int l=0,r=0,n=cards.length;
        int min=Integer.MAX_VALUE;
        while(r<n)
        {
            while(set.contains(cards[r]))
            {
                min=Math.min(min,r-l+1);
                set.remove(cards[l]);
                l++;
            }
            set.add(cards[r]);
            r++;
        }
        if(min==Integer.MAX_VALUE)
            return -1;
        return min;
    }
}