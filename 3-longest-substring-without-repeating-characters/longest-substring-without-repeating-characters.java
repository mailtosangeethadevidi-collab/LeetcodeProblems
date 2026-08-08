import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map= new HashMap<>();
        int i=0;
        int j=0;
        char arr[]=s.toCharArray();
        int len=arr.length;
        int maxlen=0;
        for(j=0;j<len;j++){
         if(map.containsKey(arr[j])){
            i=Math.max(i,map.get(arr[j])+1);
         }
        maxlen=Math.max(maxlen,j-i+1);
        map.put(arr[j],j);
        }
        
      return maxlen;
    }
}
       