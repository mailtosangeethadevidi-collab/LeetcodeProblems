class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int carry=0;
         int sumcarry=0;
         ListNode dummy=new ListNode(0);
         ListNode addnode=dummy;
         while(l1!=null&& l2!=null){
            int sum=l1.val+l2.val+carry;
            if(sum>=10){
                sumcarry=sum%10;
                carry=sum/10;
                ListNode n=new ListNode(sumcarry);
                addnode.next=n;
            }
            else{
              ListNode n=new ListNode(sum);
             addnode.next=n;
              carry=0;
            }
            l1=l1.next;
            l2=l2.next;
            addnode=addnode.next;
         }
         if(l1!=null){
             //int carry=0;
           int sumcarr=0;
       while(l1!=null){
            int sum=l1.val+carry;
            if(sum>=10){
                sumcarry=sum%10;
                carry=sum/10;
                ListNode n=new ListNode(sumcarry);
                addnode.next=n; 
            }
            else{
                ListNode n=new ListNode(sum);
                carry=0;
                addnode.next=n; 
            }
            l1=l1.next;
            addnode=addnode.next;
  }           
         }
         else if(l2!=null){
                int sumcarr=0;
       while(l2!=null){
            int sum=l2.val+carry;
            if(sum>=10){
                sumcarry=sum%10;
                carry=sum/10;
                ListNode n=new ListNode(sumcarry);
                addnode.next=n; 
            }
            else{
                ListNode n=new ListNode(sum);
                carry=0;
                addnode.next=n; 
            }
            l2=l2.next;
            addnode=addnode.next;
         }

         }
         if(carry!=0){
         ListNode ne=new ListNode(carry);
         addnode.next=ne;
         }
    return dummy.next;
    }
}