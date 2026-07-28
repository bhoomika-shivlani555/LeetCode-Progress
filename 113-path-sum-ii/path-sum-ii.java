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
    List<List<Integer>> ans=new ArrayList<>();
    
    public void path(TreeNode root, int sum,int ts,List<Integer> list)
    {
        if(root==null)
            return;
        int len=list.size();
        list.add(root.val);
        if(root.left==null && root.right==null)
        {
            if(sum+root.val==ts)
                ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        if(root.left!=null)
            path(root.left,sum+root.val,ts,list);
        
        if(root.right!=null)
            path(root.right,sum+root.val,ts,list);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list=new ArrayList<>();
        path(root,0,targetSum,list);
        return ans;
    }
}