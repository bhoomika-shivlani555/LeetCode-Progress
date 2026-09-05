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
     static class pair implements Comparable<pair>
    {
        int row;
        int val;
        pair(int row,int val)
        {
            this.row=row;
            this.val=val;
        }
        public int compareTo(pair p2)
        {
            if(this.row==p2.row)
                return this.val-p2.val;
            return this.row-p2.row;             
        }
    }

    static int min=0;
    static int max=0;

    public static void traversal(TreeNode root, HashMap<Integer,List<pair>> map,int col,int row)
    {
        if(root==null)
            return;
        
        if(map.containsKey(col))
        {
            List<pair> list=map.get(col);
            list.add(new pair(row,root.val));
            map.put(col,list);
        }
        else
        {
            List<pair> list=new ArrayList<>();
            list.add(new pair(row,root.val));
            map.put(col,list);
        }

        min=Math.min(min,col);
        max=Math.max(max,col);

        traversal(root.left,map,col-1,row+1);
        traversal(root.right,map,col+1,row+1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {
        min=max=0;
        HashMap<Integer,List<pair>> map=new HashMap<>();
        traversal(root,map,0,0);

        List<List<Integer>> ans=new ArrayList<>();

        for(int x=min;x<=max;x++)
        {
            List<pair> l1=map.get(x);
            Collections.sort(l1);
            List<Integer> list=new ArrayList<>();
            for(int y=0;y<l1.size();y++)
                list.add(l1.get(y).val);

            ans.add(list);
        }
        return ans;
    }
}