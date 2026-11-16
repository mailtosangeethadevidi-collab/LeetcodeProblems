class Solution {
    public String digitSum(String s, int k) {

       while(s.length()>k){
         int sum=0;
         int count=0;
        StringBuilder sb =new StringBuilder();
         for(char ch:s.toCharArray()){
            sum+=ch-'0';
            count++;
            if(count==k){
                sb.append(sum);
                count=0;
                sum=0;
            }
         }
         if(s.length()%k!=0)
           sb.append(sum);
         s=sb.toString();
         System.out.println(s);
       }
        return s;
        
    }
}