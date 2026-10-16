class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int x=0;x<n;x++)
        {
            if(map.containsKey(nums[x]))
                map.put(nums[x],map.get(nums[x])+1);
            else
                map.put(nums[x],1);
        }

        for(int x:map.keySet())
        {
            if(map.get(x)>(n/3))
                list.add(x);
        }
        return list;
    }
}