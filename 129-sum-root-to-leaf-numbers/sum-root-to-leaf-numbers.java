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
    class pair{
        TreeNode node;
        int cn;
        pair(TreeNode node,int cn)
        {
            this.node=node;
            this.cn=cn;
        }
    }
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        int sum=0;
        Stack<pair> s=new Stack<>();
        pair val=new pair(root,0);
        s.push(val);
        while(!s.isEmpty())
        {
            pair a=s.pop();
            TreeNode node=a.node;
            int cn=a.cn;

            cn=cn*10+node.val;
            if(node.left==null && node.right==null)
            {
                sum+=cn;
            }
            if(node.left!=null)
                s.push(new pair(node.left,cn));
            if(node.right!=null)
                s.push(new pair(node.right,cn));
        }
        return sum;  
    }
}