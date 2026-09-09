class Solution {
    public long countCommas(long n) {
          long min=1000;
          if(n<1000) {
            return 0;
          }
          long count=0;
          while(n>=min){
             count+=(n-min+1);
             min*=1000;
          }
          return count;
    }
}