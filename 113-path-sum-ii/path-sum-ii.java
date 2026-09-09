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
    public void sum(TreeNode root,List<List<Integer>> ans, List<Integer> list,int ts)
    {
        if(root==null)
            return;

        list.add(root.val);

        int size=list.size();

        if(root.left==null && root.right==null && ts-root.val==0)
            ans.add(new ArrayList<>(list));

        sum(root.left,ans,list,ts-root.val);
        sum(root.right,ans,list,ts-root.val);

        list.subList(size-1, list.size()).clear();
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        sum(root,ans,list,targetSum);
        return ans;
    }
}