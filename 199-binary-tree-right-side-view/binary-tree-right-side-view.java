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
    private HashMap<Integer,Boolean> map=new HashMap<>();
    private List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return res;
        rec(root,0);
        return res;


        
    }
    public void rec(TreeNode root,int level){
        if(root==null){
            return ;
        }
       
        if (!map.containsKey(level)) {
         

            map.put(level, true);
            res.add(root.val);
        }
        rec(root.right,level+1);
        rec(root.left,level+1);
        
    }

}
