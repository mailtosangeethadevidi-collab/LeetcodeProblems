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
    public
     void reorderList(ListNode head) {
        if(head.next==null){
            return;
        }

        ///finding the mid
        ListNode slow=head;
        ListNode fast=head;
        ListNode slowPrev=null;
        while(fast!=null&&fast.next!=null){
            slowPrev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
       
       
         slowPrev.next=null;
       
        // reversing the 2nd half

        ListNode prev=null;
        ListNode cur=slow;
        ListNode temp=slow;
       
        while(temp!=null){
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }


      //pairing
     
     ListNode first=head;
     ListNode second=prev;
        while(first!=null){
            ListNode t1=first.next;
            ListNode t2=second.next;


            first.next=second;
            if(t1==null){
                break;
            }
            second.next=t1;
            first=t1;
            second=t2;             
        }
      
    }
}