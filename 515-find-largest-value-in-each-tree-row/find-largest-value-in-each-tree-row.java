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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode>  q=new LinkedList<>();
        if(root==null)
            return ans;
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr==null)
            {
                int max=list.get(0);
                for(int x=1;x<list.size();x++)
                {
                    if(max<list.get(x))
                        max=list.get(x);
                }
                ans.add(max);
                if(q.isEmpty())
                    break;
                q.add(null);
                list=new ArrayList<>();
            }
            else
            {
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
                list.add(curr.val);
            }
        }
        return ans;
    }
}