class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x=0;x<nums.length;x++)
            set.add(nums[x]);
        int nod=set.size();

        HashMap<Integer,Integer> map=new HashMap<>();

        int l=0,r=0;
        int ans=0;
        int n=nums.length;
        while(r<n)
        {
            if(map.containsKey(nums[r]))
                map.put(nums[r],map.get(nums[r])+1);
            else
                map.put(nums[r],1);

            while(map.size()==nod)
            {
                ans=ans+n-r;
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                    map.remove(nums[l]);

                l++;
            }
            r++;
        }
        return ans;
    }
}