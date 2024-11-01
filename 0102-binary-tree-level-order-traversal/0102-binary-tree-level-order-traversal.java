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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root == null) return res;
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> neighbors = new ArrayList<>();
            int level = queue.size();

            for(int i = 0;i < level; i++) {
                TreeNode node = queue.peek();
                if(node.left != null) {
                    queue.offer(node.left);
                } 
                if(node.right != null) {
                    queue.offer(node.right);
                }
                neighbors.add(node.val);
                queue.poll();
            }
            res.add(neighbors);
        }
        return res;
    }
}