class Solution {
    public boolean checkDivisibility(int n) {
        int r=0,p=1,s=0;
        int temp=n;
        while(n>0){
          r=n%10;
          s+=r;
          p*=r;
          n=n/10;
        }
        if(temp%(s+p)==0){
            return true;
        }
        return false;
    }
}