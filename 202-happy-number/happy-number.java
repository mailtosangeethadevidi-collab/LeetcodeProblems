class Solution {
    public boolean isHappy(int n) {
    while(n!=1&&n!=4){
        int sum=0;
        while(n>0){
            sum+=((n%10)*(n%10));
            n/=10;
        }
        if(sum==4)
          return false;
        else if(sum==1)
         return true;

       n=sum;
    }
    return n==1;
    }
    
}
