 import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> l = new ArrayList<>();
        char str[]=s.toCharArray();

        int slen =str.length;
        int plen=p.length();
        int range=slen-plen;

        for(int i=0;i<=range;i++){

          char arr[]=new char[26];
          for(char ch:p.toCharArray()){
            arr[ch-'a']+=1;
           }

           for(int j=i;j<(i+plen);j++){
             arr[str[j]-'a']--;
           }
            
            int flag=0;
           for(int k:arr){
            if(k!=0){
                flag=1;
              break;
            }
           }
           if(flag==0){
            l.add(i);
           }
           if(plen==slen){
            return l;
           }
        }
       return l;     
    }
}