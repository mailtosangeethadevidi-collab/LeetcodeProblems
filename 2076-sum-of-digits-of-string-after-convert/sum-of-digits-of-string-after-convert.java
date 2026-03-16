class Solution {
    public int getLucky(String s, int k) {
       StringBuilder str=new StringBuilder();
       for(int i=0;i<s.length();i++){
        str.append(s.charAt(i)-'a'+1);
       } 
       int sum=0;
       for(int i=0;i<str.length();i++){
        sum+=(str.charAt(i)-'0');
       }
       
      return sumfun(sum,--k);
      
    }
    public static int sumfun(int n,int k ){
        if(k==0)
          return n;
       int sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }

     return  sumfun(sum,--k); 
    }
        
}