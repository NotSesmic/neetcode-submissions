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

        ArrayList<Pair<TreeNode,Integer>> stack = new ArrayList<>();
        stack.add(new Pair<>(root,1));
        int depth = 0;

        while(!stack.isEmpty()){
            Pair<TreeNode,Integer> temp = stack.removeLast();
 
            TreeNode curr = temp.getKey();
            int currDepth = temp.getValue();

            if(curr  != null){
                depth = Math.max(depth,currDepth);
                stack.add(new Pair<>(curr.left,currDepth + 1));
                stack.add(new Pair<>(curr.right,currDepth + 1));
            }
        }
        return depth;
    }
}
