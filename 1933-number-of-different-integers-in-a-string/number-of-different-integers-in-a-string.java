class Solution {
    public int numDifferentIntegers(String word) {
        int l=0;
        int r=0;
        int len=word.length();
        boolean isZero=false;
        Set<String> set = new HashSet<>();
        while(l<len&&r<len){
            char curr = word.charAt(r); 
            char prev = word.charAt(l);
            
            if(Character.isLetter(curr)){
                if(Character.isDigit(prev)){
                    String str=word.substring(l,r);
                   
                    int i=0;
                    boolean areAllZeros=true;
                    for(char ch : str.toCharArray()){
                        if(ch-'0'>0){
                            set.add(str.substring(i));
                            areAllZeros=false;
                            break;
                        }
                        i++;

                    }
                    if(areAllZeros){
                        set.add("0");
                    }
                    
                    r++;
                    l=r;
                }
                else{
                    r++;
                    l++;
                }
                
            }else
            r++;
           
        }
        if(l<len&&Character.isDigit(word.charAt(l)))
          {
             int i=0;
              String str=word.substring(l,r);
               boolean areAllZeros=true;
                    for(char ch : str.toCharArray()){
                        if(ch-'0'>0){
                            areAllZeros=false;
                            set.add(str.substring(i));
                            break;
                        }
                        i++;

                    }
                     if(areAllZeros){
                        set.add("0");
                    }
          }
        return set.size();
        
    }
}