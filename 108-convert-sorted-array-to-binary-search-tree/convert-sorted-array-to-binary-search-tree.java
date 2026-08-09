/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sort(int nums[],int start,int last)
    {
        if(start>last)
            return null;
        int mid=start+(last-start)/2;
        TreeNode nn=new TreeNode(nums[mid]);
        nn.left=sort(nums,start,mid-1);
        nn.right=sort(nums,mid+1,last);
        return nn;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums,0,nums.length-1);
    }
}