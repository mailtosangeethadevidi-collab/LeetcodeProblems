class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
     List<Integer> list = new ArrayList<>();
      int index=num.length-1;
      int carry=0;
      while(k>0&&index>=0){
       int number=num[index]+(k%10)+carry;
       if(number>=10){
        list.add(number%10);
         carry= number/10;
       }
       else{
       list.add(number);
       carry=0;
       }
       k/=10;
       index--;
    }
     while(index>=0){
        int number=num[index]+carry;
        if(number>=10){
         list.add(number%10);
         carry= number/10;
        }
         else{
       list.add(number);
       carry=0;
       }
        index--;
     }
      while(k>0){
        int number=k%10+carry;
        if(number>=10){
         list.add(number%10);
         carry= number/10;
        }
         else{
       list.add(number);
       carry=0;
       }
       k/=10;
      }
      if(carry>=1)
       list.add(carry);
     Collections.reverse(list);
    
    return list;
    }
}