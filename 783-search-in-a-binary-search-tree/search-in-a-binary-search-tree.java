class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return inorder(root, val);
    }

    public TreeNode inorder(TreeNode root, int val) {
        if (root == null) return null; 
        if (root.val == val) return root;
        
        TreeNode leftResult = inorder(root.left, val); 
        if (leftResult != null) return leftResult;
        
        return inorder(root.right, val); 
    }
}
