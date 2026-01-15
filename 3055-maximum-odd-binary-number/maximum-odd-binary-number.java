class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
           
            if(sb.charAt(sb.length()-1)!='1'){
            if(sb.charAt(i)=='1'){
                char ch =sb.charAt(i);
                sb.setCharAt(i,'0');
                sb.setCharAt(sb.length()-1,ch);
                break;
            }
            }
             if(sb.charAt(sb.length()-1)=='1')
               break;  
        }
       int i=0;
       int n=sb.length()-2;
       while(i<n){
        if(sb.charAt(n)=='1' && sb.charAt(i)=='0'){
            char ch =sb.charAt(n);
            sb.setCharAt(n,sb.charAt(i));
            sb.setCharAt(i,ch);
            i++;
        }
        if(sb.charAt(i)=='1'){
            i++;
        }
        if(sb.charAt(n)=='0')
        n--;
       }
       return sb.toString();
    }
}