/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public boolean parents(TreeNode root,TreeNode p,ArrayList<TreeNode> list){
       if(root==null)
            return false;
        list.add(root);
        if(root.val==p.val)
            return true;

        if(parents(root.left,p,list) || parents(root.right,p,list))
            return true;
        list.remove(list.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> list1=new ArrayList<>();
        ArrayList<TreeNode> list2=new ArrayList<>();

        parents(root,p,list1);
        parents(root,q,list2);

        int x=0;
        for(x=0;x<list1.size() && x<list2.size();x++)
        {
            if(list1.get(x).val!=list2.get(x).val)
                return list1.get(x-1);
        }
        if(x<list1.size())
            return q;
        else
            return p;
    }
}