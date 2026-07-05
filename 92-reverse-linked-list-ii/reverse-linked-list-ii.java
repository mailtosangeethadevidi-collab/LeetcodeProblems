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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null){
            return head;
        }
       int pos=1;
     
       ListNode prev=null;
        ListNode lastprev=head;
       ListNode cur=head;
        ListNode newprev =null;
        ListNode tail =null;
       while(cur!=null&&pos<=right){
           if(pos==left){
           
            lastprev=prev;
           
           while(cur!=null&&pos<=right){
           ListNode newnode = new ListNode(cur.val);
           if(tail==null){
            tail=newnode;
           }
            newnode.next=newprev;
            newprev=newnode;
            cur=cur.next;
            pos++;
           }
           tail.next=cur;
           break;
           }
           prev=cur;
           cur=cur.next;
           pos++;
           
       }
       if(left==1){
        head=newprev;
       }
       else
       lastprev.next=newprev;

       
       
        return head;
    }
}