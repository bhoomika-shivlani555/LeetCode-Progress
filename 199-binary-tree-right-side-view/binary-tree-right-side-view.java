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
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> level=new LinkedList<>();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        q.offer(root);
        level.offer(1);
        map.put(1,root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            int currl=level.poll();
            map.put(currl,curr);
            if(curr.left!=null)
            {
                q.offer(curr.left);
                level.offer(currl+1);
            }
            if(curr.right!=null)
            {
                q.offer(curr.right);
                level.offer(currl+1);
            }
        }
        for(int x:map.keySet())
            list.add(map.get(x).val);
        return list;
    }
}