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
    // public TreeNode level(TreeNode root)
    // {
    //     Queue<TreeNode> q=new LinkedList<>();
    //     Queue<Integer> l=new LinkedList<>();
    //     q.offer(root);
    //     l.offer(1);
    //     while(!q.isEmpty())
    //     {
    //         Node curr=q.poll();
    //         int currl=l.poll();
    //         if(curr.left!=null)
    //         {
    //             q.offer(curr.left);
    //             l.offer(currl+1);
    //         }
    //         else if(curr.right!=null)
    //         {
    //             q.offer(curr.right);
    //             l.offer(currl+1);
    //         }
    //         else
    //             return currl;    
    //     }
    // }
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> l=new LinkedList<>();
        q.offer(root);
        l.offer(1);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            int currl=l.poll();
            if(curr.left==null && curr.right==null)
                return currl;
            if(curr.left!=null)
            {
                q.offer(curr.left);
                l.offer(currl+1);
            }
            if(curr.right!=null)
            {
                q.offer(curr.right);
                l.offer(currl+1);
            }   
        }
        return 0;
    }
}