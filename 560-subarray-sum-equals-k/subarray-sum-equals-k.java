class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        map.put(0,1);
        int sum=0;
        for(int x=0;x<nums.length;x++)
        {
            sum=sum+nums[x];
            if(map.containsKey(sum-k))
                count+=map.get(sum-k);
            if(map.containsKey(sum))
                map.put(sum,map.get(sum)+1);
            else
                map.put(sum,1);
        }
        return count;
    }
}