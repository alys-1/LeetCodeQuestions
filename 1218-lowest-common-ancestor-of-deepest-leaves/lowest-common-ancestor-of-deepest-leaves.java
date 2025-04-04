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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int maxDepth = depth(root);
        return dfs(root, maxDepth, 0);
    }
    int depth(TreeNode root){
        if(root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    TreeNode dfs(TreeNode root, int maxDepth, int len){
        if(root == null) return null;
        if(maxDepth - 1 == len) return root;
        TreeNode left = dfs(root.left, maxDepth, len + 1);
        TreeNode right = dfs(root.right, maxDepth, len + 1);
        if(left != null && right != null) return root;
        return left != null ? left : right; 
    }
}
