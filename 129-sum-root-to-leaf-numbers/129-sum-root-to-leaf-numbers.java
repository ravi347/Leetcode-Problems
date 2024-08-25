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
    int total = 0;
    
    public void dfs(TreeNode root, int sum){
        if(root == null){
            return;
        }
        
        sum = sum *10 + root.val;
        
        if(root.left == null && root.right == null){
            total += sum;
        }
        
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return total;
    }
}