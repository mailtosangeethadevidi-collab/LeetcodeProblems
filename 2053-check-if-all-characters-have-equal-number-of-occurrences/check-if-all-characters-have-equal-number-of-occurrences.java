class Solution {
    public boolean areOccurrencesEqual(String s) {
       int hash[]=new int[26];
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            hash[arr[i]-'a']++;
        } 
        int expected=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]!=0){
              if(expected==0)
                expected=hash[i];
            
            else if(hash[i]!=expected)
             return false;
            }
        }
        
            
        
        return true;
    }
}