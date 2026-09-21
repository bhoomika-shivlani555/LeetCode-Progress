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
    ArrayList<Integer> list;
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);        
    }

    public TreeNode toBST(int l,int r)
    {
        if(l>r)
            return null;
        int mid=l+(r-l)/2;
        TreeNode node=new TreeNode(list.get(mid));
        node.left=toBST(l,mid-1);
        node.right=toBST(mid+1,r);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        list=new ArrayList<>();
        inorder(root);
        return toBST(0,list.size()-1);
    }
}