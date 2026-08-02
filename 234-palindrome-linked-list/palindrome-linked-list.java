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
        if( head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode slowPrev=null;
        while(fast!=null&&fast.next!=null){
            slowPrev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        slowPrev.next=null;

        ListNode prev=slow;
        ListNode cur=head;
        ListNode temp=head;
        while(cur!=null){
            temp=temp.next;
            cur.next=prev;
            prev=cur;
            cur=temp;

        }
        if(fast!=null){
            slow=slow.next;
        }
        
        while(prev!=null&&slow!=null){
            if(prev.val!=slow.val){
                return false;
            }
            prev=prev.next;
            slow=slow.next;
        }
     return true;
    }
}