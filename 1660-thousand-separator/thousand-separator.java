class Solution {
    public String thousandSeparator(int n) {
        if(n<1000)
          return n+"";
          int temp=n;
        StringBuilder sb = new StringBuilder();
        int count=0;
        while(n>0){
            count++;
            sb.append(n%10);
            if(count==3){
                sb.append(".");
                count=0;

            }
            n/=10;
        }
       if((temp+"").length()%3==0)
         return sb.reverse().toString().substring(1);
        return sb.reverse().toString();
    }
}