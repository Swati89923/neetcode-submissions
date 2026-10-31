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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res=inorder(root);
        return res.get(k-1);
    }

    public static ArrayList<Integer> inorder(TreeNode root){
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        res.addAll(inorder(root.left));
        res.add(root.val);
        res.addAll(inorder(root.right));
        return res;
    }
}
