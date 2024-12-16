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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return countDepth(root, 0);
    }

    private int countDepth(TreeNode root, int depth) {
        if(root == null) return depth;
        return Math.max(countDepth(root.left, depth+1), countDepth(root.right, depth+1));
    }
}