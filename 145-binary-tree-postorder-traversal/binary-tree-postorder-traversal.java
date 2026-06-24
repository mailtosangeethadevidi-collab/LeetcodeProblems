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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        if(root==null)
          return l;
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode cur=st1.pop();
            st2.push(cur);
            if(cur.left!=null){
                st1.push(cur.left);
            }
            if(cur.right!=null){
                st1.push(cur.right);
            }
        }
        while(!st2.isEmpty()){
            l.add(st2.pop().val);
        }
        
     return l;
        
    }
}