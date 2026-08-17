class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int x=0;x<nums1.length;x++)
            set1.add(nums1[x]);

         for(int x=0;x<nums2.length;x++)
            set2.add(nums2[x]);

        for(int x:set1)
            if(!set2.contains(x))
                list.add(x);

        ans.add(list);
        list=new ArrayList<>();

        for(int x:set2)
            if(!set1.contains(x))
                list.add(x);

        ans.add(list);
        return ans;

    }
}