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
    public ListNode insertionSortList(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode newhead=head;
        ListNode tail=head;
        ListNode nextNode=head.next;
        ListNode temp=head;
        while(nextNode!=null&&temp!=null){
              temp=nextNode.next;
            if(nextNode.val<=newhead.val){
                nextNode.next=newhead;
                newhead=nextNode;    
            }
           
            else if(nextNode.val>=tail.val){
                tail.next=nextNode;
                tail=tail.next;
               // tail.next=null;
            }
            else{
               ListNode temp2=newhead;
                ListNode prev=null;
                while(temp2!=null&&temp2.val<=nextNode.val){
                    prev=temp2;
                    temp2=temp2.next;
                }
                nextNode.next=temp2;
                prev.next=nextNode;
            }
             nextNode=temp;
           
        }
        tail.next=null;
        return newhead;
        
    }
}