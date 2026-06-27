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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> ls= new LinkedList<>();
        Queue<TreeNode> rs= new LinkedList<>();
        ls.add(root);
        rs.add(root);
        while(!ls.isEmpty() && !rs.isEmpty()){
            TreeNode node1=ls.poll();
            TreeNode node2=rs.poll();
            if(node1 == null && node2 == null)
                    continue;

            if(node1 == null || node2 == null)
                return false;
            if(node1.val!=node2.val){
                return false;
            }
            ls.add(node1.left);
            ls.add(node1.right);
            rs.add(node2.right); 
            rs.add(node2.left);

        }
  return true;

    }
}