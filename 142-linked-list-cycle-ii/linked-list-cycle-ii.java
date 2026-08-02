/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int mark=Integer.MAX_VALUE;
      
       if(head==null)
        return null;

        while(head!=null){
           
            if(head.val==mark){
                return head;
            }
            head.val=mark;
            head=head.next;
        }
       
    
        return null;
    }
   
}