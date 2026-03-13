import java.util.Arrays;
class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> l=new ArrayList<>();
       // int i=0;
        int carry=1;
        if(digits[digits.length-1]>=9)
          carry=1;
     for( int i=digits.length-1;i>0;i--){
        if(digits[i]==9&&carry==1){
         l.add(0);
          carry=1;
        }
        else if(digits[i]==9&&carry==0){
         l.add(9);
        }
        else if(digits[i]<9){
         l.add(digits[i]+carry);
         carry=0;
        }
     }
     if(digits[0]==9)
       {
         if(carry==1){
        l.add(0);
        l.add(1);
         }
         else
          l.add(9);
       }
       else if(digits[0]<9){
         if(carry==1){
           l.add(digits[0]+carry);
         }
         else
          l.add(digits[0]);
       }
     int res[]=new int[l.size()];
     int index=0;
     for(int i=res.length-1;i>=0;i--){
        res[i]=l.get(index++);
     }
     return res;
    }
}