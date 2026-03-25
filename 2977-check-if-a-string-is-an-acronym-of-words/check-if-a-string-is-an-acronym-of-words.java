import java.util.*;
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
      // ListIterator li=words.listIterator();
       for(int i=0;i<words.size();i++){
        String str=words.get(i);
        sb.append(str.charAt(0));
        if(sb.length()>s.length())
          return false;
       }
       if((sb.toString()).equals(s)){
        return true;
       }
       return false;
    }
}