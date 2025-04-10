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
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return res;
        rec(root,0);
        return res;
        
    }
    public void rec(TreeNode root,int level){
        if (root == null) return ;
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
                rec(root.left,level+1);

        rec(root.right,level+1);
          
    }
}