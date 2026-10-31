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
    public int goodNodes(TreeNode root) {
        return solve(root,Integer.MIN_VALUE);
    }
    public static int solve(TreeNode root, int maxVal){
        if(root==null){
            return 0;
        }
        int count=0;
        if(root.val>=maxVal){
            count=1;
        }
        maxVal=Math.max(root.val,maxVal);
        count+=solve(root.left,maxVal);
        count+=solve(root.right,maxVal);
        return count;
    }
}
