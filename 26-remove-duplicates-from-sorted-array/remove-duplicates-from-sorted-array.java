class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int c=0;
        for(int x=0;x<nums.length;x++)
        {
            if(!set.contains(nums[x]))
            {c++;set.add(nums[x]);}
        }
        int a=0;
        for(Integer x:set)
        nums[a++]=x;
        for(int x=a;x<nums.length;x++)
        nums[x]=999;
        Arrays.sort(nums);
        return c;
    }
}