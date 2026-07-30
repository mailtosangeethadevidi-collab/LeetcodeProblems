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
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode arr[]=new ListNode[k];
        ListNode temp=head;
        if(head==null){
            return arr;
        }
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }

        int equalNodes=n/k;
        int remaining=n%k;
        int j=0;
        if(remaining>0){
           j=1;
        }
       

        ListNode cur=head;
        for(int i=0;i<arr.length;i++){
            int m=1;
           temp=cur;
            while(m<(equalNodes+j)){
                temp=temp.next;
                m++;
            }
            arr[i]=cur;
            if(temp!=null){
            cur=temp.next;
            temp.next=null;
            }
            remaining-=j;
           j=remaining>0?1:0;
          
        }
      return arr;
    }
}