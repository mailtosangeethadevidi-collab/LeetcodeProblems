class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char one[]=new char[26];
        char two[]=new char[26];
        for(char ch :s1.toCharArray()){
            one[ch-'a']++;
        }
       int l=0;
       int r=0;
       int s2len=s2.length();
       int s1len=s1.length();
       while(r<s2len){
        two[s2.charAt(r)-'a']++;
        if(r-l+1==s1len){
            if(Arrays.equals(one,two)){
                return true;
            }
            two[s2.charAt(l)-'a']--;
            l++;
       }
       r++;
       }
       return false;
       
    }
}