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
    int maxVal=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       maxDiameter(root);
       return maxVal;
    }
    public  int maxDiameter(TreeNode root){
          if(root==null){
            return 0;
          }
        //   int maxVal=0;
          int leftSum=Math.max(0,maxDiameter(root.left));
          int rightSum=Math.max(0,maxDiameter(root.right));
          maxVal =Math.max(maxVal,root.val+leftSum+rightSum);
        return root.val+Math.max(leftSum,rightSum);
    }
}
