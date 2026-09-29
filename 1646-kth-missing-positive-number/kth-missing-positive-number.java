class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max=1;
        HashSet<Integer> set=new HashSet<>();
        for(int x=0;x<arr.length;x++)
        {
           set.add(arr[x]);
            max=Math.max(max,arr[x]);
        }
        for(int x=1;x<=max;x++)
        {
            if(!set.contains(x))
                k--;
            if(k==0)
                return x;
        }
        return max+k;
    }
}