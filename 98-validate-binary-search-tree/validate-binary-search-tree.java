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
    public boolean BST(TreeNode root, TreeNode min, TreeNode max){
        if(root==null)
            return true;
        if((min!=null && root.val<=min.val) || (max!=null && root.val>=max.val))
            return false;
        
        return BST(root.left,min,root) && BST(root.right,root,max);
    }
    public boolean isValidBST(TreeNode root) {
        return BST(root,null,null);
    }
}