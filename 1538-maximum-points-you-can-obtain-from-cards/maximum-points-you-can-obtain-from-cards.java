class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int l=0,r=n-k;
        int max=0,sum=0;
        for(int x=r;x<n;x++)
            sum+=cardPoints[x];
        
        while(r<n)
        {
            max=Math.max(max,sum);
            sum=sum-cardPoints[r]+cardPoints[l];
            r++;
            l++;
        }
        max=Math.max(max,sum);
        return max;
    }
}