/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head){
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       ListNode h=head;
       ListNode cur=head;
       ListNode prev=slow;
       while(h!=slow){
         h=h.next;
        cur.next=prev;
        prev=cur;
       
        cur=h;
       }
        if(fast!=null){
            slow=slow.next;
        }
       while(slow!=null){
        if(prev.val!=slow.val){
            return false;
        }
        prev=prev.next;
        slow=slow.next;
       }
      return true; 
    }
}