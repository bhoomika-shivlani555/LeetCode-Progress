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
    public boolean pathSum(TreeNode root,int targetSum)
    {
        if(root==null)
            return false;
        System.out.println(targetSum);
        if(root.left==null && root.right==null && targetSum-root.val==0)
            return true;
        
        return pathSum(root.left,targetSum-root.val)|| pathSum(root.right,targetSum-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(targetSum!=0 && root!=null && root.left==null && root.right==null && root.val==targetSum)
            return true;
        if(root==null || root.val==targetSum && targetSum!=0 )
            return false;
        return pathSum(root,targetSum);
    }
}