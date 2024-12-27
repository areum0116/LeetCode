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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        search(root, "", result);
        return result;
    }

    void search(TreeNode root, String path, List<String> result) {
        if(root.left == null && root.right == null) {
            result.add(path + root.val);
        }
        if(root.left != null) search(root.left, path + root.val + "->", result);
        if(root.right != null) search(root.right, path + root.val + "->", result);
    }
}