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
    public ListNode removeElements(ListNode head, int val) { 
        if(head==null){
            return head;
        }
        ListNode prev=new ListNode(0);
        ListNode t=prev;
        while(head!=null){
            while(head!=null && head.val==val){
                head=head.next;
            }
            if(head!=null && head.val!=val){
            ListNode newnode=new ListNode(head.val);
            prev.next=newnode;
            head=head.next;
            prev=prev.next;
            }
        }
       return t.next;
    }
}