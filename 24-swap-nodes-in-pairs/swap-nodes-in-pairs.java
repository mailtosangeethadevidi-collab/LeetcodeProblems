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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
    ListNode dummy=new ListNode(0);
    ListNode prev=dummy;
    ListNode cur=head;
    while(cur!=null&&cur.next!=null){
        ListNode third=cur.next.next;
        ListNode second=cur.next;

        second.next=cur;
        cur.next=third;
        prev.next=second;

       
        prev=cur;
         cur=third;
    }
    return dummy.next;
    }
}