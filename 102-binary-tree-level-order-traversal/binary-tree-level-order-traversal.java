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
    List<List<Integer>> res = new ArrayList<>();
   
    Queue<TreeNode> q = new ArrayDeque<>();
    TreeNode temp=root;
    if(root==null){
        return res;
    }
    q.offer(root);
   List<Integer> l1 = new ArrayList<>();
   l1.add(root.val);
    res.add(l1);
    while(!q.isEmpty()){
         
           List<Integer> l = new ArrayList<>();
        int size=q.size();
         while(size>0){ 
          
             TreeNode t = q.poll();
        if(t.left!=null){
            l.add(t.left.val);
            q.offer(t.left);
        }
        if(t.right!=null){
            l.add(t.right.val);
             q.offer(t.right);
        }
        size--;
    }
        if(l.size()>0)
        res.add(l);
      
    }
    return res;
        
    }
}