class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        int count=0;
        while(i<j){
            char chi=s.charAt(i);
            char chj=s.charAt(j);
            if(chi!=chj){
            count++;
            StringBuilder sbi=new StringBuilder(s.substring(i+1,j+1));
             boolean bi=isP(sbi);
             StringBuilder sbj=new StringBuilder(s.substring(i,j));
             boolean bj=isP(sbj);
             if(bi||bj == true)
               return true;
             else 
             return false;
            }
            if(count>1){
             return false;
             }
             i++;
             j--;

        }
       return true;
    }
    public static boolean isP(StringBuilder one){
        int i=0;
        int j=one.length()-1;
         while(i<j){
            char chi=one.charAt(i);
            char chj=one.charAt(j);
            if(chi!=chj){
              return false;
            }
            i++;
            j--;
         }
         return true;
    }
    
}