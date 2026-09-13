import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>s=new HashSet<Integer>();
        for(int x=0;x<nums.length;x++)
            s.add(nums[x]);
        if(s.size()==nums.length)
        return false;
        else
        return true;
    }
}