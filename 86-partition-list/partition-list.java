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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode less=new ListNode(0);
        ListNode templess=less;
        ListNode greater=new ListNode(0);
        ListNode tempgreater=greater;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val<x){
                less.next=cur;
                less=less.next;
            }
            else{
                greater.next=cur;
                greater=greater.next;
            }
            cur=cur.next;
        }
      greater.next=null;
      less.next=tempgreater.next;
      return templess.next;  
    }
}