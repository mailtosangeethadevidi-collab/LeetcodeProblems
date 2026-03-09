import java.util.*;
class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
      HashMap<Character,Integer> mapran = new HashMap<>();
      for(int i=0;i<ransomNote.length();i++){
         char ch = ransomNote.charAt(i);
        mapran.put(ch,mapran.getOrDefault(ch,0)+1);
      }
       HashMap<Character,Integer> mapmag = new HashMap<>();
      for(int i=0;i<magazine.length();i++){
         char ch = magazine.charAt(i);
        mapmag.put(ch,mapmag.getOrDefault(ch,0)+1);
      }
      for(int i=97;i<=122;i++){
        char ch=(char)(i);
        if(mapran.get(ch)!=null &&mapmag.get(ch)==null ){
            return false;
        }
       else if(mapran.get(ch)!=null &&mapmag.get(ch)!=null ){
        if(mapmag.get(ch)<mapran.get(ch)){
          return false;
        }
        }
      }
      return true;
    }
}