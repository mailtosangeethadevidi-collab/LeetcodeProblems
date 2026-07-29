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
       
        ListNode prev=null;
      
        while(fast!=null && fast.next!=null){
            ListNode temp=slow;
            slow=slow.next;
            fast=fast.next.next;

            temp.next=prev;
            prev=temp;
        }
       
        if(fast!=null){
            slow=slow.next;
        }
       while(prev!=null&&slow!=null&&slow.val==prev.val){
      
        prev=prev.next;
        slow=slow.next;
       }
      return slow==null; 
    }
}