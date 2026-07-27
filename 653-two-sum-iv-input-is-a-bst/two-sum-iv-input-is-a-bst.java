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
    public void inorder(List<Integer> list,TreeNode root)
    {
        if(root==null)
            return;
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        inorder(list,root);
        int l=0,r=list.size()-1;
        while(l<r)
        {
            int sum=list.get(l)+list.get(r);
            if(sum==k)
                return true;
            else if(sum>k)
                r--;
            else
                l++;
        }
        return false;
    }
}