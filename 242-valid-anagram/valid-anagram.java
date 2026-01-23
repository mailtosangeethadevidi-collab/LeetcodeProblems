import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       } 
      int hash[]=new int[27];
      for(int i=0;i<s.length();i++){
        hash[s.charAt(i)-'a'+1]++;
        hash[t.charAt(i)-'a'+1]--;
      }
      for(int i=0;i<26;i++){
        if(hash[i]>0){
            return false;
        }
      }
      return true;  
        
    }
}