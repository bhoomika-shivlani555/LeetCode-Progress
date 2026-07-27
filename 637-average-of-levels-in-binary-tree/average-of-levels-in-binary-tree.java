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
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode>  q=new LinkedList<>();
        if(root==null)
            return null;
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr==null)
            {
                ans.add(list);
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        List<Double> ans=new ArrayList<>();
        list=levelOrder(root);
        for(int x=0;x<list.size();x++)
        {
            double avg=0.0;
            List<Integer> l=list.get(x);
            for(int y=0;y<l.size();y++)
                avg=avg+l.get(y);
            avg=avg/l.size();
            ans.add(avg);
        }
        return ans;
    }
}