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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
       ListNode h=new ListNode(head.val);
       ListNode current=head.next;
       if(current==null){
        return h;
       }
       while(current.next!=null){
            ListNode newnode=new ListNode(current.val);
            newnode.next=h;
            h=newnode;
            current=current.next;
       }
       ListNode newnode=new ListNode(current.val);
         newnode.next=h;
         h=newnode;
   return h;
    }
}