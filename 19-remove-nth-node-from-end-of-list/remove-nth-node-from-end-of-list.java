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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int totalnodes=0;
        ListNode h=head;
        ListNode finalhead=h;
        while(head!=null){
            totalnodes+=1;
            head=head.next;
        }
        if(totalnodes==1){
            return null;
        }
        ListNode prev=h;
        int current=0;
        while(h!=null){
           current+=1;
           if(current==(totalnodes-n+1)){
            break;
           }
           prev=h;
           h=h.next;
        }
        if(current==1){
            return prev.next;
        }
        if(h!=null)
          prev.next=h.next;
          return finalhead;
    }
}