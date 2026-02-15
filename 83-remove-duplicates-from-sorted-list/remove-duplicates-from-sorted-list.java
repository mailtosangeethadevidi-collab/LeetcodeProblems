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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(head==null){
            return temp;
        }
        int prevval=head.val;
        ListNode h=new ListNode(prevval);
       ListNode newnode=h;
        temp=head.next;
        if(temp==null){
            return head;
        }
        while(temp!=null){
            while(temp!=null &&temp.val==prevval){
                temp=temp.next;
                 
            }
            newnode.next=temp;
            newnode=newnode.next;
            if(temp!=null)
            prevval=temp.val;
        }
        return h;
    }
}