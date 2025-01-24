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
    ArrayList<Integer> newt = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
    inorder(root);
    TreeNode head = new TreeNode(newt.get(0));
    TreeNode temp = head;
    for(int i = 1; i<newt.size(); i++){
        temp.right = new TreeNode(newt.get(i));
        temp = temp.right;
    }    
    return head;
    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        newt.add(root.val);
        inorder(root.right);
    }
}