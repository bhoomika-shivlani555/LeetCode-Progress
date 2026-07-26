class Solution {
    public int largestInteger(int n, int s) {
        if(s>9*n)
            return -1;
        StringBuilder sb=new StringBuilder();
        for(int x=0;x<n;x++)
            {
                if(s>=9)
                {
                    sb.append(9);
                    s=s-9;
                }
                else
                {
                    sb.append(s);
                    s=0;
                }
            }
        return Integer.parseInt(sb.toString());
    }
}