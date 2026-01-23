class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int n=s.length()-1;
        char temp='1';
        while(i<n){
            if(sb.charAt(i)==sb.charAt(n)){
                i++;
                n--;
            }
            else if(sb.charAt(i)>sb.charAt(n)){
               sb.setCharAt(i,sb.charAt(n));
               i++;
               n--;
            }
            else if(sb.charAt(i)<sb.charAt(n)){
               sb.setCharAt(n,sb.charAt(i));
               i++;
               n--;
            }
        }
        return sb.toString();
    }
}