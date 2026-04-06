class Solution {
    public int divisorSubstrings(int num, int k) {
     int i=0,count=0;
     String str=String.valueOf(num);
     while(i<=str.length()-k){
       String sub=str.substring(i,i+k);
        int number=Integer.parseInt(sub);
        if(number!=0&&num%number==0)
          count++;
        
       i++;
     }
      return count;
    }
}