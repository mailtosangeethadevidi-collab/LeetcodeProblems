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
        ListNode temp=null;
     while(head!=null){
          ListNode newnode = new ListNode(head.val);
          newnode.next=temp;
          temp=newnode;
          head=head.next;
     }  
     return temp;
    }
}