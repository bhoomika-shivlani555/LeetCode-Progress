class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int x=0;x<nums.length;x++)
        {
            sum=sum+nums[x];
            if(map.containsKey(sum-goal))
                count=count+map.get(sum-goal);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}