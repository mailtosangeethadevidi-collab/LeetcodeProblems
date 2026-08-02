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
    int i=1;
  ListNode temp=head;
    ListNode ptr=head;
    while(i<=n){
        ptr=ptr.next;
        i++;
    }

    if(ptr==null){
        return head.next;
    }
   ListNode prev=head;
  while(ptr!=null){
    prev=head;
    head=head.next;
    ptr=ptr.next;
  }
  prev.next=head.next;
  return temp;



    }
}
       