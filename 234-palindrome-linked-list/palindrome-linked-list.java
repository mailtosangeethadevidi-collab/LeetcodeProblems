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
    public boolean isPalindrome(ListNode head){
        if(head==null){
            return true;
        }
       ListNode h=new ListNode(head.val);
       ListNode current=head.next;
       if(current==null){
        return true;
       }
       while(current!=null){
        ListNode newnode=new ListNode(current.val);
        newnode.next=h;
        h=newnode;
        current=current.next;
       }
        while(h!=null&&head!=null){
            if(head.val!=h.val){
                return false;
            }
            head=head.next;
            h=h.next;
        }
        return true;
    }
}