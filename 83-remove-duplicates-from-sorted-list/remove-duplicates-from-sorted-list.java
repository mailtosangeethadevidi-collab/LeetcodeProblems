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
       if(head==null ||head.next==null){
        return head;
       }
       ListNode temp=head;
       while(head!=null){
        ListNode cur=head.next;
        int num=head.val;
        while(cur!=null &&cur.val==num){
            cur=cur.next;
        }
        head.next=cur;
        head=head.next;
       }
         return temp;
    }
  
}