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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            level++;
            if (level % 2 == 1 && !queue.isEmpty()) {
                int[] nodes = new int[queue.size()];
                int i = 0;
                // only switch the values (not the nodes)
                for (TreeNode node : queue) {
                    nodes[i++] = node.val;
                }
                for (TreeNode node : queue) {
                    node.val = nodes[--i];
                }
            }
        }
        return root;
    }
}