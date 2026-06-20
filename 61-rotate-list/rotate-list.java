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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if(head==null || k==0){
            return head;
        }

        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(count==1){
            return head;
        }
        
        k=k%count;
        if(k==0){
            return head;
        }
        temp.next=head;
        temp=head;
        
        int limit=count-k;
        while(limit>=2){
              limit--;
              temp=temp.next;
            
        }
        ListNode head2=temp.next;
        temp.next=null;
        return head2;
    }
}