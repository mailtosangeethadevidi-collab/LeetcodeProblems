class Solution {
    public int countCharacters(String[] words, String chars) {
        char hash[]=new char[26];
        for(char ch:chars.toCharArray()){
            hash[ch-'a']++;
        }
        int len=0;
        for(String str : words){
            char hashArr[]=new char[26];
            boolean isGood=true;
            for(char ch : str.toCharArray()){
                hashArr[ch-'a']++;
                if(hash[ch-'a']==0){
                    isGood=false;
                    break;
                }
                if(hash[ch-'a']<hashArr[ch-'a']){
                    isGood=false;
                    break;
                }
                  
            }
            if(isGood) len+=str.length();
        }
        return len;
        
    }
}