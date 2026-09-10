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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null) return null;
        
        ArrayList<TreeNode> res = new ArrayList<>();
        
        res.add(root);
        
        while(!res.isEmpty()){
            TreeNode curr = res.removeLast();
            TreeNode temp = curr.left == null ? null : curr.left;
            curr.left = curr.right == null ? null : curr.right;
            curr.right = temp;
            if(curr.left != null) res.add(curr.left);
            if(curr.right != null) res.add(curr.right);

        }
        return root;
    }
}
