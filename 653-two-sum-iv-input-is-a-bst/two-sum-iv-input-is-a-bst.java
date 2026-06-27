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
    ArrayList<Integer> l = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        FindTarget(root);
        int right=l.size()-1;
        int left=0;
        int sum=0;
        while(left<right){
         sum=l.get(left)+l.get(right);
         if(sum==k){
            return true;
         }
         else if(sum<k){
            left++;
         }
         else{
            right--;
         }
        }
        return false;
           }
    public void FindTarget(TreeNode root){
         if(root!=null){
         FindTarget(root.left);
         l.add(root.val);
         FindTarget(root.right);
        }

    }

}