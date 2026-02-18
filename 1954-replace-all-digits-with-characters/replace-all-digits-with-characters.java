class Solution {
    public String replaceDigits(String s) {
     
      StringBuilder sb = new StringBuilder(s);
      for(int i=1;i<s.length();i+=2){
        char prev=sb.charAt(i-1);
        int digit=sb.charAt(i)-'0';
          sb.setCharAt(i,(char)(prev+digit));
      } 
      return sb.toString();
    }
}