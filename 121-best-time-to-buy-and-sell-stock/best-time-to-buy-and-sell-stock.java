class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],max=0;
        for(int x=0;x<prices.length;x++)
        {
            int curr=prices[x]-buy;
            max=Math.max(max,curr);
            if(prices[x]<=buy)
                buy=prices[x];
        }
        return max;
    }
}