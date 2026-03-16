class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            char chi=s.charAt(i);
            char chj=s.charAt(j);
            if(chi!=chj){
               return isP(s,i+1,j)||isP(s,i,j-1);
            }
             i++;
             j--;

        }
       return true;
    }
    public static boolean isP(String one ,int left,int right){
         while(left<right){
            char chi=one.charAt(left);
            char chj=one.charAt(right);
            if(chi!=chj){
              return false;
            }
            left++;
            right--;
         }
         return true;
    }
    
}