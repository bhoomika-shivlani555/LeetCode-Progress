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
    int idx=0;
    public TreeNode create(int preorder[],int min, int max)
    {
        if(idx>=preorder.length)
            return null;
        
        int val=preorder[idx];
        if(val<=min || val>=max)
            return null;

        TreeNode nn=new TreeNode(val);
        idx++;
        nn.left=create(preorder,min,val);
        nn.right=create(preorder,val,max);
        return nn;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return create(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}