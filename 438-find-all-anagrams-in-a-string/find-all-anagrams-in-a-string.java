 import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String str, String p) {
        
        List<Integer> l = new ArrayList<>();
        char input[]=str.toCharArray();

        int slen =input.length;
        int plen=p.length();
        int range=slen-plen;
        if(slen<plen){
            return l;
        }

        char anag[]=new char[26];
        for(char ch:p.toCharArray()){
            anag[ch-'a']+=1;
        }
        
        char hash[]=new char[26];
       
        int i=0;
        int j=0;      
        int count=0;
        while(j<slen){
            hash[input[j]-'a']++;
           
            if(j-i+1==plen){
                if(Arrays.equals(hash,anag)){
                    l.add(i);
                }
                
                 hash[input[i]-'a']--;
                 i++;
            }
            j++;
           
        }
       
    return l;
      
    }
    
}