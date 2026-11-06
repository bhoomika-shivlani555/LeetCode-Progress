class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x=0;x<nums.length;x++)
        {
            map.put(nums[x],map.getOrDefault(nums[x],0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int x:map.keySet())
        {
            if(map.get(x)==2)
                list.add(x);
        }
        return list;
    }
}