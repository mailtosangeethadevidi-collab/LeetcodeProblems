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
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        if(head!=null)
        if(head.next!=null){
         fast=head.next.next;
        }
        while(fast!=null&&fast.next!=null){
            
            if(head==fast){
                return true;
            }
            head=head.next;
            fast=fast.next.next;
           
        }
        return false; 
    }
}