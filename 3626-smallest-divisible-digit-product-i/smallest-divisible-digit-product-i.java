class Solution {
    public int smallestNumber(int n, int t) {
     
       while(true) {
        int p=1;
        int temp=n;
        while(n>0){
            p*=(n%10);
            n/=10;
        }
        if(p%t==0){
            return temp;
        }
        n=++temp;
       }
      // return 0;
    }
}