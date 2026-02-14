class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int carry=0;
         int sumcarry=0;
         ListNode dummy=new ListNode(0);
         ListNode addnode=dummy;
         ListNode prev1=l1;
         ListNode prev2=l2;
         while(prev1!=null&& prev2!=null){
            int sum=prev1.val+prev2.val+carry;
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
            prev1=prev1.next;
            prev2=prev2.next;
            addnode=addnode.next;
         }
         if(prev1!=null){
             //int carry=0;
           int sumcarr=0;
       while(prev1!=null){
            int sum=prev1.val+carry;
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
            prev1=prev1.next;
            addnode=addnode.next;
  }           
         }
         else if(prev2!=null){
                int sumcarr=0;
       while(prev2!=null){
            int sum=prev2.val+carry;
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
            prev2=prev2.next;
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