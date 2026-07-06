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
       ListNode res= new ListNode(0);
       ListNode temp=res;
       ListNode prev=null;
       ListNode cur=head;
       if(cur.val!=cur.next.val){
        temp.next=new ListNode(cur.val);
        temp=temp.next;
       }
       prev=cur;
       cur=cur.next;
       while(cur!=null){
        if(cur.next==null){
            if(cur.val!=prev.val){
                temp.next=new ListNode(cur.val);
                temp=temp.next;
            }
        }
        else{
            if(cur.val!=prev.val && cur.val!=cur.next.val){
                temp.next=new ListNode(cur.val);
                temp=temp.next;
            }
        }
        prev=cur;
        cur=cur.next;
       }
       return res.next;
    }
}