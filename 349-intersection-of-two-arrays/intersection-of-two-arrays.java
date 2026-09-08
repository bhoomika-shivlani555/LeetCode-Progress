class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int x=0;x<nums1.length;x++)
            set1.add(nums1[x]);
        for(int x=0;x<nums2.length;x++)
            set2.add(nums2[x]);
        HashSet<Integer> set3=new HashSet<>();

        for(int x:set1)
            if(set2.contains(x))
                set3.add(x);

        

        int ans[]=new int[set3.size()];
        int k=0;
        for(int x:set3)
            ans[k++]=x;
        
        return ans;

    }
}