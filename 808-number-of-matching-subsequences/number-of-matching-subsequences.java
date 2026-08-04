import java.util.*;
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        
        HashMap<Character,TreeSet<Integer>> map = new HashMap<>();
        
        for(char ch :s.toCharArray()){
        map.put(ch,new TreeSet<>());       
        }

       int k=0;
        for(char ch :s.toCharArray()){
            TreeSet<Integer> t=map.get(ch);
            t.add(k);
            map.put(ch,t);
            k++;
        }

        int count=0;
        for(String str:words){
          Integer latest=-1;
            int flag=0;
            for(char ch :str.toCharArray()){
                if(map.containsKey(ch)){
                    
                    
                    
                    Integer nextIndex=map.get(ch).higher(latest);
                    if(nextIndex!=null){
                        latest=nextIndex;   
                        flag=1;
                    }
                    
                    else{
                        flag=0;
                        break;
                    }
                }
                else{
                    flag=0;
                    break;
                }
                    
                   
                }
            if(flag==1){
                count++;
            }
        }
                
            
           
        return count;
    }
}