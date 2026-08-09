class Solution {
    public int[] decrypt(int[] code, int k) {

        int n=code.length;
        int res[]=new int[n];
        if(k==0){
            return res;
        }
        
        else if(k>0){
           int sum=0;
          for(int i=1;i<=k;i++){
            sum+=code[i];
          }
          res[0]=sum;
          int left=1;
          int right=(k+1)%n;
          while(left<n){
            sum-=code[left];
            sum+=code[right];
            res[left]=sum;
            left++;
            right=(right+1)%n;

          }
          
        }
        else{
               int sum=0;
            for(int i=n+k;i<n;i++){
                sum+=code[i];
            }
            int left=(n+k)%n;
            res[0]=sum;
            int right=1;
            while(right<n){
                sum-=code[left];
                sum+=code[right-1];
                res[right]=sum;
                left=(left+1)%n;
                right++;

            }
        }
          return res;
    }
}