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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        q.add(root);

        while(!q.isEmpty())
        {
            int size=q.size();
            for(int x=0;x<size-1;x++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
            }
            TreeNode curr=q.poll();
            if(curr.left!=null)
                    q.offer(curr.left);
            if(curr.right!=null)
                q.offer(curr.right);

            list.add(curr.val);
        }
        return list;
    }
}