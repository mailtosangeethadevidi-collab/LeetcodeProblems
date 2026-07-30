
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode slowPrev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slowPrev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        slowPrev.next=slow.next;
        return head;
    }
}