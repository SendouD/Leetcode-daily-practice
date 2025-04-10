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
    private int count=0;
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        rec(root, root.val); // start with root value as initial max
        return count;

    }
    public void rec(TreeNode node,int maxSoFar){
           if (node == null) return;

        if (node.val >= maxSoFar) {
            count++;
            // System.out.println("Good node: " + node.val + " (max so far: " + maxSoFar + ")");
        }

        int newMax = Math.max(maxSoFar, node.val);
        rec(node.left, newMax);
        rec(node.right, newMax);

    }
}