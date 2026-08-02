class Solution {
    public boolean isHappy(int n) {
   int slow=digitSum(n);
   int fast=digitSum(slow);
   while(slow!=fast){
    slow=digitSum(slow);
    fast=digitSum(digitSum(fast));
    if(slow==fast){
        break;
    }
   }
   return slow==1;
    }
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=((n%10)*(n%10));
            n/=10;
        }
        return sum;

    }
    
}
