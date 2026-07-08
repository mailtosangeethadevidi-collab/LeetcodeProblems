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
 import java.util.Deque;
 import java.util.ArrayDeque;
class Solution {
    public void reorderList(ListNode head) {
        if(head.next==null){
            return ;
        }
        Deque<ListNode> dq = new ArrayDeque<>();
        ListNode temp=head;
        while(temp!=null){
            dq.add(temp);
            temp=temp.next;
        }
       int n = dq.size()/2-1;

       temp=new ListNode(0);
       head=temp;
       int length=dq.size();
       while(n>=0){
          temp.next=dq.pollFirst();
          temp=temp.next;
          temp.next=dq.pollLast();
          temp=temp.next;
          n--;
       } 
       if(length%2!=0){
        temp.next=dq.pollFirst();
        temp=temp.next;
       }
       temp.next=null;
   
        head=head.next;
    }
}