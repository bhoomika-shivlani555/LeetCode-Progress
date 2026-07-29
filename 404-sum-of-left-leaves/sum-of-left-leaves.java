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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int sum=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int x=0;x<s;x++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null)
                {
                    if(curr.left.left==null && curr.left.right==null)
                        sum+=curr.left.val;
                    else
                        q.offer(curr.left);
                }
                if(curr.right!=null)
                    q.offer(curr.right);
            }
        }
        return sum;
    }
}