class Solution {
    public boolean canConstruct(String s, int k) {
        char hash[]=new char[26];
        if(s.length()<k){
            return false;
        }
        for(char ch : s.toCharArray()){
            hash[ch-'a']++;
        }
        int oddCount=0;
        for(int i : hash){
            if(i%2!=0){
                oddCount++;
            }
            if(oddCount>k){
            return false;
        }
            
        }
        
        return true;
    }
}