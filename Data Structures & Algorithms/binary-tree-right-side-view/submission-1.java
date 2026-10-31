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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                 TreeNode curren=q.poll();
                 l.add(curren.val);
                 if(curren.left !=null){
                    q.offer(curren.left);
                 }
                 if(curren.right !=null){
                    q.offer(curren.right);
                 }
            }
            ans.add(l.get(l.size()-1));
        }
        return ans;
    }
}
