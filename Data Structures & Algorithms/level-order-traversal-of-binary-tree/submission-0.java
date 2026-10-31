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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result= new ArrayList<>();
       if(root==null){
        return result;
       }
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
         int size=q.size();
         List<Integer> l=new ArrayList<>();
         for(int i=0;i<size;i++){
            TreeNode curren=q.poll();
            l.add(curren.val);
            if(curren.left !=null){
                q.offer(curren.left);
            }
            if(curren.right != null){
                q.offer(curren.right);
            }
         }result.add(l);
       }
       return result;
    }
}
